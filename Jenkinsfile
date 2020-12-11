#!groovy

pipeline {
    agent any

    stages {
        stage('docker build') {
            steps {
                sh "docker build -t test-java-app:${tag} ."
            }
        }

        stage('docker push') {
            steps {
                sh "echo push"
            }
        }
    }
}
