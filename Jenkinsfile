def call(Map pipelineParams) {
    pipeline {
        agent any
        tools {
            maven 'maven'
        }
        options {
            buildDiscarder(
                logRotator(
                    daysToKeepStr: '30',
                    artifactDaysToKeepStr: '30'
                )
            )
            timeout(time: 50, unit: 'MINUTES')
            timestamps()
            disableConcurrentBuilds()
        }
        
