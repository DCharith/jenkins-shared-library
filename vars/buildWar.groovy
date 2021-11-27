#!/usr/bin/env groovy

def call(){
    echo "Packaging war file..."
    sh "mvn -Dmaven.test.skip=true clean package"
}
