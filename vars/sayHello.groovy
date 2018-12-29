#!/usr/bin/env groovy

def call(String result = 'SUCCESS') {
  echo "Result, ${result}."

  if (result == "SUCCESS") {
       echo "Test Passed"
  }
}

