pipeline {
    agent any

    // triggers { pollSCM('* * * * *') }
    stages {
        
        stage("Verify Proceed") {
            steps {
               option { timeout(time:2, unit:"MINUTES") }
               input {
                   message "Do you with to proceed?"
                   parameters {
                       string(name: "ACK", defaultValue: "y", "type y to proceed to production")
                   }
               } 
            }
            steps {
                script {
                    if (ACK == 'y') {
                        echo "Proceeding to deploy to region [${Region}]"

                    } else {
                        error("Deployment aborted!")
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
