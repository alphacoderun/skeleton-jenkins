pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                timeout(1) {
                    echo "###################################"
                    echo "Target Region ${Region}"
                    echo "###################################"
                    input message: 'press proceed', ok: 'Ok', submitterParameter: 'ACK'
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
