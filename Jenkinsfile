pipeline {
    agent any

    // triggers { pollSCM('* * * * *') }
    stages {
        stage('Build') {
            steps {
                sh 'echo hello ${Region} ${Version} ${Username} ${Userpassword}'
            }
        }
    }
}
