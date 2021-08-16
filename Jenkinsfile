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

                      startHour = 14
                      startMinute = 10
                      stopHour = 15
                      stopMinute = 20            
                    //   def props = readProperties file: 'test.properties'
                    //    def prop = new ConfigSlurper().parse(new File('test.properties').toURL())
                        
                        
                    //   def prop = new Properties()
                    //   prop.load(new File("test.properties"))
                      

                      println "Deployment Window start time: " + startHour + ":" startMinute
                      println "Deployment Window stop time: " + stopHour + ":" stopMinute
                      
                      println "Current Time: " + currentHour + ":" + currentMinute
                      def inBuildWindow = false
                      if (currentHour >= startHour && currentMinute >= startMinute) {
                        if (currentHour <= stopHour && currentMinute <= stopMinute) {
                            inBuildWindow = true
                        }
                      }
                      if (!inBuildWindow) {
                        error("Aborting the build as current time not within deployment window")
                      } else {
                        println("The build is withing the deployment window")
                      }

                  }
              }  
        }
        stage('Build') {
            steps {
                sh 'echo building..... hello ${Region} ${Version} ${Username}'
            }
        }
    }
}
