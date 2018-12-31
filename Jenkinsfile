#!/usr/bin/env groovy
  

pipeline {
   agent any
   stages {
      stage('Tag the build') {
         steps {
          sh "git tag -a build100"
         }
      }
  }

}
