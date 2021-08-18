
println 'hello world!!'


println "Hour of Day const: " + Calendar.HOUR_OF_DAY
println "Current minutes: " + Calendar.MINUTE


now = Calendar.getInstance()
currentHour = now.get(Calendar.HOUR_OF_DAY)
currentMinute = now.get(Calendar.MINUTE)

println 'Current Time: ' + currentHour + ':' + currentMinute
inBuildWindow = false

println 'isBuildWindow before: ' + inBuildWindow

startTime = 1450
stopTime = 1553
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
    println 'Aborting the build as current time not within deployment window'
} else {
    println 'The build is withing the deployment window'
}

println 'Finished'
