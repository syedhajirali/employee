pipeline {
  environment {
    registry = 10.128.0.12:5000/syedhajirali/employee"
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
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
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
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}
