#!/usr/bin/env groovy
  

pipeline {
   agent any
   stages {
      stage('Tag the build') {
         steps {
            withCredentials([[$class: 'UsernamePasswordMultiBinding',
                credentialsId: '<CREDENTIAL_ID>',
                usernameVariable: 'USERNAME',
                passwordVariable: 'PASSWORD']]) {
                   sh('git push https://${USERNAME}:${PASSWORD}@repo_url --tags')
                }
         }
      }
  }

}
