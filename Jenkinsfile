pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo "build*********"
source /etc/profile
mvn clean
pwd'''
      }
    }

    stage('Test') {
      steps {
        sh '''echo "test******"
mvn test'''
      }
    }

    stage('Package') {
      steps {
        sh '''echo "Package******"
mvn -Dmaven.test.skip=true package
pwd
'''
      }
    }

    stage('Deploy') {
      agent any
      steps {
        sh '''echo "Deploy******"
pwd
ll'''
      }
    }

  }
}