#!/usr/bin/env groovy
  

pipeline {
   agent any
   stages {
      stage('Tag the build') {
         steps {
          sh("git config user.name 'addepalliamareswar@gmail.com'")
          sh("git config user.email 'addepalliamareswar@gmail.com'")
          sh('git tag -a v1.0 -m "created git tag"')
withCredentials([[$class: 'UsernamePasswordMultiBinding', 
                credentialsId: 'MyID', 
                usernameVariable: 'GIT_USERNAME', 
                passwordVariable: 'GIT_PASSWORD']]) {    
    sh('git push https://${GIT_USERNAME}:${GIT_PASSWORD}@repo_url --tags')
}
         }
      }
  }

}
