pipeline {
  agent any
  stages {
    stage('Build') {
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

    stage('Deliver') {
      steps {
        sh '''echo "Deploy******"
        pwd
				mv -f target/my.war /usr/local/tomcat7/webapps/
				sh /usr/local/tomcat7/bin/shutdown.sh
				sleep 10
				sh /usr/local/tomcat7/bin/startup.sh'''
      }
    }

  }
}