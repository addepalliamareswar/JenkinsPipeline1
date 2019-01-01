#!/usr/bin/env groovy 

pipeline {
   agent any
   
   parameters {
         string (name: 'Greeting', defaultValue:'Hello', description:'How should I greet the world?')
 
         choice(name: 'Region', choices:['US-EAST-1', 'US-EAST-2'], description:'Select AWS Region')

         booleanParam(name: 'userFlag', dafaultValue: true, description:''))
   }
   stages {
      stage('Parameters Example') {
         steps {
            echo "${params.Greeting}"
         }
      }
   }
}
