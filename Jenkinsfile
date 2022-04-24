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
                // Maven
                // and/or
                // Docker image
            }
        }
        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                // Deploy artifact and run on digitalocean
                // or
                // Deploy docker image and run on digitalocean
                echo 'Deploying....'
            }
        }
    }
}