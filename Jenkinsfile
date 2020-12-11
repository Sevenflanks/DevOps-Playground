#!groovy

def FAILING_TARGET = 0

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
                sh "docker login harbor.softleader.com.tw -u ${image_registry_user} -p ${image_registry_pass}"
            }
        }
    }
}
