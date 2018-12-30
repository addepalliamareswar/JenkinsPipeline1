#!/usr/bin/env groovy 

/* import shared library */
@Library('jenkins-shared-library')_

pipeline {
   agent {
      docker {
          image 'maven:3-alpine'
          args '-v /root/.m2:/root/.m2'
      }
   }
   stages {
      stage('Build') {
         steps {
             sh 'mvn -B -DskipTests clean package'
         }
      }

     stage('Test') {
            steps {
                sh 'mvn test -Dtest=HelloWorld'
            }
          
            post {
                always {
                    junit 'target/surefire-reports/*.xml'

                     // Archieve artifacts
                    script {
                        pUtilities.archiveArtifacts()
                        sh("git tag -a 100 -m 'Jenkins'")
                        sh('git push master --tags')
                    }
                     slackNotifications(currentBuild.currentResult)

                }
            }
        }
  }
  
}
