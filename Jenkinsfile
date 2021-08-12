pipeline {
    agent any

    // triggers { pollSCM('* * * * *') }
    stages {
        stage('verify') {
            steps {
                timeout(1) {
                    input message: 'okay to deploy to ${Region}', ok: 'Ok'
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
