//Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                            sh 'source ~/.bash_profile'
                            sh 'source /etc/profile'
                            sh 'make'
                            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
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