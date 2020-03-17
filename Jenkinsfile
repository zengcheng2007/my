pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh '''
        echo "build*********"
				source /etc/profile
				mvn clean
				pwd
				'''
      }
    }

    stage('Test') {
      steps {
        sh '''
        echo "test******"
				source /etc/profile
				mvn test
				'''
      }
    }

    stage('Package') {
      steps {
        sh '''
        echo "Package******"
				source /etc/profile
				mvn -Dmaven.test.skip=true package
				pwd
				'''
      }
    }

    stage('Deploy') {
      steps {
        sh '''echo "Deploy******"
pwd
sh /usr/local/tomcat7/bin/JenkinsDeploy.sh my dev'''
      }
    }

  }
}