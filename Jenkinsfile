pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew build docker dockerRun'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}