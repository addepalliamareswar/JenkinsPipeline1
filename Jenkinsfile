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
                     pUtilities.archiveArtifacts()
                     slackNotifier(currentBuild.currentResult)

                }
            }
        }
     stage('Tagging the build') {
      steps {
            sh("git tag -a tag1 -m 'Jenkins'")
            sh('git push https://addepalliamareswar@gmail.com:@mar9908471028A@JenkinsPipeline1 --tags')

      }
     }
  }
  
}
