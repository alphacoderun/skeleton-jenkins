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
                    //   println "Now: " + now
                    //   println "Debug Current time: " + hour + ":" + minute
                      
                      cmpHour = 12
                      cmpMinute = 40
                      println "Current Time: " + hour + ":" + minute
                      if (hour <= cmpHour && minute <= cmpMinute) {
                        println "less than " + cmpHour + ":" + cmpMinute
                      } else {
                        println "greater than " + cmpHour + ":" + cmpMinute
                        throw new Exception("Aborting the build")
                      }

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
