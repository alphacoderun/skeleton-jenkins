pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                timeout(1) {
                    echo "###################################"
                    echo "Target Region ${Region}"
                    echo "###################################"
                    // input message: 'press proceed', ok: 'do itOk', submitterParameter: 'ACK'
                    input {
                        message 'press to deploy?'
                        ok 'do it'
                        parameters {
                            string(name: 'Region', defaultValue: 'PROD', description: 'Target deployment environment')
                        }
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
