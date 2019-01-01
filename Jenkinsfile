#!/usr/bin/env groovy 

pipeline {
   agent any
   
   parameters {
         string (name: 'Greeting', defaultValue:'Hello', description:'How should I greet the world?')
   }
   stages {
      stage('Parameters Example') {
         steps {
            echo "${params.Greeting}"
         }
      }
   }
}
