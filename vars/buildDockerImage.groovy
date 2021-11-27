#!/usr/bin/env groovy

def call(){
    echo "Building Docker image..."
    withCredentials([usernamePassword(credentialsId: "dockerhub-credentials", usernameVariable: "username", passwordVariable: "password")]){
        sh "docker build -t dcharith/mobile-app-ws:2.0 ."
        sh "echo $password | docker login -u $username --password-stdin"
        sh "docker push dcharith/mobile-app-ws:2.0"
    }
}