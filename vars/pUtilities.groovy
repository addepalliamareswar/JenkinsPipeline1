#!/usr/bin/env groovy

def archiveArtifacts() {
// Archive the build output artifacts.
    archiveArtifacts artifacts: 'target/surefire-reports/*.xml'
}
