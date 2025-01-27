pipeline {
    agent any
    tools { 
		maven 'MAVEN_HOME'
	}
    stages {
      stage('Git Checkout') {
            steps {
                script {
                    git url: 'https://github.com/rajeshkit/devopsdemorepo.git'
                    echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
					bat "mvn clean install"
          			echo 'maven build is done'
            }
        }
       
        
    }
 }



