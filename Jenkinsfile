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
        stage('docker image'){
            steps{
				echo "Build no is ${BUILD_ID}"
				echo "Build no is ${BUILD_NUMBER}"
                bat 'docker build -t 9894851315/devopsimage -f Dockerfile .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                bat 'docker container rm -f devopscontainer'
                bat 'docker run --name devopscontainer -itd -p 9595:9595 9894851315/devopsimage'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
        
    }
 }



