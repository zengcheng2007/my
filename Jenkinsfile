pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
mvn clean
infer -- mvn compile'''
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
      steps {
        sh '''sh \'pwd\'
sh \'ll\''''
      }
    }

  }
}