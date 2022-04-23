pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(name: 'maven3') {
                    sh "mvn clean verify"
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}