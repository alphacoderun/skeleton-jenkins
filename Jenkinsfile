pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                  script {
                      println "Hello world from script!!!"

                      def now = Calendar.getInstance();
                      def currentHour = now.getAt(Calendar.HOUR_OF_DAY)
                      def currentMinute = now.getAt(Calendar.MINUTE)
                      
                      def props = readProperties file: 'test.properties'
                      println "Deployment Window start time: " + props.startHour + ":" props.startMinute
                      println "Deployment Window stop time: " + props.stopHour + ":" props.stopMinute
                      
                      println "Current Time: " + currentHour + ":" + currentMinute
                      def inBuildWindow = false
                      if (currentHour >= props.startHour && currentMinute >= props.startMinute) {
                        if (currentHour <= props.stopHour && currentMinute <= props.stopMinute) {
                            inBuildWindow = true
                        }
                      }
                      if !inBuildWindow {
                        error("Aborting the build as current time not within deployment window")
                      }

                  }
              }  
        }
        stage('Build') {
            steps {
                sh 'echo build hello ${Region} ${Version} ${Username}'
            }
        }
    }
}
