pipeline {
    agent any

    stages {
        stage('verify') {
            def doesJavaRock = input(message: 'Do you like Java?', ok: 'Yes', 
                        parameters: [booleanParam(defaultValue: true, 
                        description: 'If you like Java, just push the button',name: 'Yes?')])

            echo "Java rocks?:" + doesJavaRock
            
        }
        stage('Build') {
            steps {
                sh 'echo build hello ${Region} ${Version} ${Username} ${Userpassword}'
            }
        }
    }
}
