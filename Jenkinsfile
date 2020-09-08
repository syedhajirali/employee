pipeline {

  environment {
    registry = "10.128.0.12:5000/syedhajirali/employee"   
    dockerImage = ""
  }

  agent any
    stages {
  
    stage('Checkout Source') {
      steps {
        git 'https://github.com/syedhajirali/employee.git'
      }
    }
      
      stage('Maven Install') {
      agent {
        docker {
          image 'maven:3.5.0'
        }
      }
      steps {
        sh 'mvn clean install'
      }
      }

    stage('Build image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }

      
        
    stage('Push Docker Image') {
      steps{
        script {
          docker.withRegistry( "" ) {
            dockerImage.push()
             }
        }
      }
    }
      stage("Run container on Dev server"){
        docker run -p 8080:8080 dockerImage
      }
    stage('Deploy App') {
      steps {
        script {
          kubernetesDeploy(configs: "employee.yaml", kubeconfigId: "mykubeconfig")
        }
      }
    }

  }

}
