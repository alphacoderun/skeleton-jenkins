pipeline {
    agent any

    // triggers { pollSCM('* * * * *') }
    stages {
        stage('verify') {
            steps {
                timeout(2) {
                    input message: 'press proceed', ok: 'Ok', submitterParameter: 'ACK'
                }
                sh 'echo value of ack [${ACK}]'
                
            }
        }
        stage('Build') {
            steps {
                sh 'echo build hello ${Region} ${Version} ${Username} ${Userpassword}'
            }
        }
    }
}
