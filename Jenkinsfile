pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                  script {
                      println "Hello world from script!!!"

                      def now = Calendar.getInstance();
                      def hour = now.getAt(Calendar.HOUR)
                      def minute = now.getAt(Calendar.MINUTE)

                      println "Current time: " + hour + ":" + minute
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
