pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh '''
        echo "build*********"
	/usr/local/maven3.6.3/bin/mvn clean
	pwd
				'''
      }
    }

    stage('Test') {
      steps {
        sh '''
        echo "test******"
	/usr/local/maven3.6.3/bin/mvn test
				'''
      }
    }

    stage('Package') {
      steps {
        sh '''
        echo "Package******"
		/usr/local/maven3.6.3/bin/mvn -Dmaven.test.skip=true package
		pwd
				'''
      }
    }
	stage('Deliver'){
		when {
                branch 'dev'
         }
		 steps {
			echo "Deliver******"
		 }
	}
    stage('Deploy') {
		when {
                branch 'uat'
         }
      steps {
        sh '''
		echo "Deploy******"
		pwd
		sh -x /usr/local/tomcat7/bin/JenkinsDeploy.sh my dev
		'''
      }
    }

  }
}