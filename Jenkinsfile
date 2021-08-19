pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                  script {

                    properties([
                        parameters([
                            choice(
                                choices: ['ONE', 'TWO'], 
                                name: 'Region',
                                description: 'Select the server you want'
                            ),
                            booleanParam(
                                defaultValue: false, 
                                description: 'Click to overide', 
                                name: 'Override'
                            ),
                            string(
                                defaultValue: 'dummyV3', 
                                name: 'Version Number',
                                description: 'Enter a <div style="border:4px solid Tomato;">test</div><br/>ptext here', 
                                trim: true
                            )
                        ])
                    ])

                        // now = Calendar.getInstance()
                        // currentHour = now.get(Calendar.HOUR_OF_DAY)
                        // currentMinute = now.get(Calendar.MINUTE)
                        // currentTime = currentHour * 100 + currentMinute

                        // beginWindow = params['beginWindow']
                        // endWindow = params['endWindow']
                        // inDeployWindow = false

                        // println "#####before########"
                        // println  beginWindow
                        // println  endWindow
                        // println "###################"

                        // begintHour = Integer.parseInt(beginWindow.split(":")[0])
                        // beginMinute = Integer.parseInt(endWindow.split(":")[1])
                        // beginTime = begintHour * 100 + beginMinute

                        // endHour = Integer.parseInt(endWindow.split(":")[0])
                        // endMinute = Integer.parseInt(endWindow.split(":")[1])
                        // endtime = endHour * 100 + endMinute

                        // println "Begin Time:   " + beginTime
                        // println "End Time:     " + endtime
                        // println "Current Time: " + currentTime

                        env.Version_Number = params['Version Number']
                  }

              }
        }
        stage('Build') {
            steps {
                sh 'echo doing a dummy build.... hello ${Region} ${Version_Number} ${Override}'
            }
        }
    }

    post {
        always {
            script {
                curlCmd = env.BUILD_URL + "/consoleText"
                debugLog = sh(script: curlCmd, returnStdout: true).trim()
                txt = "##############################\n" + debugLog + "\n##############################"
                println txt

            }
        }
    }
}
