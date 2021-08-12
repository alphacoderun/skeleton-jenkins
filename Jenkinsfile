pipeline {
    agent any

    stages {
        stage('verify') {
            // steps {
                // timeout(1) {
                input {
                    message: 'Did you want to continue or not', 
                    ok: 'testok'
                }
                // }
                // sh 'echo value of ack [${ACK}]'
                
            // }
            steps {
                echo 'going ahead with the change'
            }
        }
        stage('Build') {
            steps {
                sh 'echo build hello ${Region} ${Version} ${Username} ${Userpassword}'
            }
        }
    }
}
