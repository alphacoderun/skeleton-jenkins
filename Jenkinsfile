pipeline {
    agent any

    stages {
        stage('verify') {
            steps {
                timeout(1) {
                    input message: 'press proceed', ok: 'Ok', submitterParameter: 'ACK'
                }
                // sh 'echo value of ack [${ACK}]'
                
            }
        }
        stage('Build') {
            steps {
                sh 'echo build hello ${Region} ${Version} ${Username} ${Userpassword}'
            }
        }
    }
}
