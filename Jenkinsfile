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
                                name: 'PARAMETER_01'
                                description: 'Select the server you want'
                            ),
                            booleanParam(
                                defaultValue: false, 
                                description: 'Click to overide', 
                                name: 'BOOLEAN_VALUE'
                            ),
                            string(
                                defaultValue: 'scriptcrunch', 
                                name: 'STRING-PARAMETER',
                                description: 'Enter a test text here', 
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
                  }

              }
        }
        stage('Build') {
            steps {
                sh 'echo building..... hello ${Region} ${Version} ${Username}'
            }
        }
    }
}
