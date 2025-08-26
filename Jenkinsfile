pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'   // Use the name you configured in Jenkins Tools
        jdk 'JDK 17'          // Use the name you configured for JDK
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/ashishshah1710/Quarkus-Practise-project.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean install'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Run') {
            steps {
                sh './mvnw quarkus:dev'
            }
        }
    }

    post {
        success {
            echo '✅ Build and run successful!'
        }
        failure {
            echo '❌ Build failed.'
        }
    }
}
