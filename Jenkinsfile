#!/usr/bin/env groovy
  

pipeline {
   agent any
   stages {
      stage('Tag the build') {
         steps {
          sh("git config user.name 'addepalliamareswar@gmail.com'")
          sh("git config user.email 'addepalliamareswar@gmail.com'")
          //sh('git tag -a v1.1 -m "created git tag"')
           
withCredentials([[$class: 'UsernamePasswordMultiBinding', 
                credentialsId: '7e3c12fd-0209-48a9-8f55-24e63992d694', 
                usernameVariable: 'addepalliamareswar', 
                passwordVariable: '@mar9908471028A']]) {    
    sh('git push https://addepalliamareswar@github.com/addepalliamareswar/JenkinsPipeline1.git --tags')
}
         }
      }
}

}
