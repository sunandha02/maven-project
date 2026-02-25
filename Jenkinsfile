pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/sunandha02/maven-project.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Package JAR') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Install to Local Repo') {
            steps {
                sh 'mvn install'
            }
        }
    }

    post {
        success {
            echo 'Build Successful'
        }
        failure {
            echo 'Build failed'
        }
    }
}
