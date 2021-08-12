#!/usr/bin/env groovy

def call(giturl){

        deleteDir()
        print("Git Clone")
        checkout([$class: 'GitSCM', branches: [[name: 'main']],
        userRemoteConfigs: [[url: giturl]]])
        def addr=pwd()
        print(pwd)
        sh "ls"
}