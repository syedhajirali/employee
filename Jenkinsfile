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

    stage('Build image') {
      steps{
        script {
          dockerImage = docker.build -t registry + ":$BUILD_NUMBER"
        }
      }
    }

    stage('Push Image') {
      steps{
        script {
          docker.withRegistry( "" ) {
            dockerImage.push()
          }
        }
      }
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
