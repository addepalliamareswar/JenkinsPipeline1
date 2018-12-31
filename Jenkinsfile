#!/usr/bin/env groovy
  

pipeline {
   agent any
   stages {
      stage('Tag the build') {
         steps {
            echo "${GIT_USERNAME}"
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
