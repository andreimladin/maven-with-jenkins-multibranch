pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(maven: 'maven3') {
                    sh "mvn clean verify -DskipTests"
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven: 'maven3') {
                    sh "mvn test"
                }
            }
        }
        stage('Snapshot') {
            when {
                branch 'main'
            }
            steps {
                echo 'Releasing....'
            }
        }
        stage('Release') {
            when {
                branch 'main'
            }
            steps {
                echo 'Releasing....'
            }
        }
        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying....'
            }
        }
    }
}