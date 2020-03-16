pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''sh "source /etc/profile"
sh "mvn clean"
sh "infer -- mvn compile"'''
        archiveArtifacts(artifacts: '**/target/*.jar', fingerprint: true)
      }
    }

    stage('Test') {
      steps {
        sh '''sh "mvn test"
junit \'target/surefire-reports/TEST-*.xml\''''
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