pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''source /etc/profile
mvn clean'''
        archiveArtifacts(artifacts: '**/target/*.jar', fingerprint: true)
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Package') {
      steps {
        sh '''sh "\'mvn\' -Dmaven.test.skip=true package"
archive \'target/*.jar\''''
      }
    }

    stage('Deploy') {
      agent any
      steps {
        sh '''sh \'pwd\'
sh \'ll\''''
      }
    }

  }
}