pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(maven: 'maven3') {
                    sh "mvn clean install -DskipTests"
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
        stage('Sonar') {
            steps {
                echo 'Running Sonar....'
            }
        }
        stage('Snapshot') {
            when {
                branch 'PR**'
            }
            steps {
                echo 'Snapshoting....'
            }
        }
        stage('Release') {
            when {
                branch 'main'
            }
            steps {
                echo 'Releasing artifact or docker image ...'
            }
        }
        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying artifact or docker image to digitalocean....'
            }
        }
    }

    post {
        failure {
            echo "Build failed"
        }
    }
}