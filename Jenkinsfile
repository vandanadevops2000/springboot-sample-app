
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
        environment {
            repoName = "${pipelineParams.reponame}"
            branchData = "${env.GIT_BRANCH}"
            projectArtifactId = 'ArtifactId'
            projectGroupId = 'GroupId'
            // projectVersion = 'Version'
            artifactType = 'Packaging'
            backupVersionCount = '5'
            SONARQUBE_SERVER = 'http://54.80.107.116:9000'
            awsCredentials = 'AWS'
            awsRegion = 'us-east-1'
            s3BucketURL = 'shru123'
            developtag = 'latest'
            awsAccountId = '796973488942'
            USERNAME = 'vandanadevops2000'
            PASSWORD = 'Git'
        }
        stages {
            stage("Env Variables") {
                steps {
                    echo "The build number is ${env.BUILD_NUMBER}"
                    echo "You can also use \${BUILD_NUMBER} -> ${env.BUILD_NUMBER}"
                    sh 'echo "I can access $BUILD_NUMBER in shell command as well."'
                    script {
                        int backupVersion = backupVersionCount.toInteger()
                        int currentBuildNo = env.BUILD_NUMBER.toInteger()
                        int artifactDeleteVersion = currentBuildNo - backupVersion
                        echo "branch is ${branchData}!"
                        if (branchData.contains("/")) {
                            def (branchName, branchVersion) = branchData.split("/", 2)
                            echo "Branch Name is ${branchName}!"
                            echo "Branch Version is ${branchVersion}!"
                        } else {
                            def branchName = branchData
                            echo "Branch name without version is ${branchName}!"
                            echo "Branch version not available!"
                        }
                    }
                }
            
            // Additional stages can be added here
        }
        // post conditions can be added here
    }
}

