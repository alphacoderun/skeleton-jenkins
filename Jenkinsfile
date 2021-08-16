pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                  script {
                      println "Hello world from script!!!"

                      def now = Calendar.getInstance();
                      def hour = now.getAt(Calendar.HOUR_OF_DAY)
                      def minute = now.getAt(Calendar.MINUTE)
                      println "Now: " + now
                      println "Debug Current time: " + hour + ":" + minute
                  }
              }  
        }
        stage('Build') {
            steps {
                sh 'echo build hello ${Region} ${Version} ${Username} ${Userpassword}'
            }
        }
    }
}
