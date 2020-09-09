pipeline {
  environment {
    registry = "10.128.0.12:5000/syedhajirali/employee"
     dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
       git 'https://github.com/syedhajirali/employee.git'
      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = 10.128.0.12:5000/syedhajirali/employee:24
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '' ) {
            dockerImage.push()
          }
        }
      }
    }
   
    
     stage('Deploy App to Kubernetes Cluster') {
      steps {
        script {
          kubernetesDeploy(configs: "employee.yaml", kubeconfigId: "mykubeconfig")
        }
      }
    }
  }
}
