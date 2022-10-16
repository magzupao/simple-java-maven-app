pipeline {
    agent {
        docker {
            image 'maven:3.3.3'            
            args '-v $HOME/.m2:/root/.m2'            
        }
    }
    stages {
         stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '0eba9e7131f1aed0f57234fb10e85f91016e60aa', url: 'https://github.com/magzupao/simple-java-maven-app.git']]])
            }
        }
        stage('Build') {
            steps {
                echo '**********************************************************'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
