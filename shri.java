pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               bat "Build Stage"
            }
        }
        stage('Test') {
            steps {
              bat  "Test Stage"
            }
        }
        // Additional stages
    }
    post {
        always {
            bat "This is Jenkinsfile"
        }
    }
}
