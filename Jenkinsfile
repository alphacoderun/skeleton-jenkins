pipeline {
    agent any

    stages {
        stage('verify') {
              steps {
                  script {
println "Hello world from script!!!"

now = Calendar.getInstance()
currentHour = now.getAt(Calendar.HOUR_OF_DAY)
currentMinute = now.getAt(Calendar.MINUTE)

println 'Current Time: ' + currentHour + ':' + currentMinute
inBuildWindow = false

println 'isBuildWindow before: ' + inBuildWindow

startTime = 1450
stopTime = 1453
println 'Start Time: ' + startTime
println 'Stop Time: ' + stopTime
currentTime = currentHour * 100 + currentMinute

println 'Current time concat: ' + currentTime

if (currentTime >= startTime) {
    if (currentTime <= stopTime) {
        inBuildWindow = true
    }
}

if (!inBuildWindow) {
    error('Aborting the build as current time not within deployment window')
} else {
    println 'The build is withing the deployment window'
}
               
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
