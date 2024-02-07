pipeline {
  agent any

  tools {
    maven "maven"
  }
  stages {
    stage('git') {
      steps {
        git branch: 'main', url: 'https://github.com/anchal994/department-service.git'
      }
      //               post {
      //     failure {
      //         emailext subject: "Build Failed: ${currentBuild.fullDisplayName}",
      //                  body: "The build failed. Please check the Jenkins console output for more details.",
      //                  to: "soham.kulkarni@tcognition.com, roshan.farkate@tcognition.com",
      //                  attachLog: true
      //     }
      // }
    }
    stage('compile') {
      steps {
        bat "mvn compile"
      }
      //               post {
      //     failure {
      //         emailext subject: "Build Failed: ${currentBuild.fullDisplayName}",
      //                  body: "The build failed. Please check the Jenkins console output for more details.",
      //                  to: "soham.kulkarni@tcognition.com, roshan.farkate@tcognition.com",
      //                  attachLog: true
      //     }
      // }
    }
    stage('test') {
      steps {
        // bat "mvn test"
        echo "test cases"
      }
      //               post {
      //     failure {
      //         emailext subject: "Build Failed: ${currentBuild.fullDisplayName}",
      //                  body: "The build failed. Please check the Jenkins console output for more details.",
      //                  to: "soham.kulkarni@tcognition.com, roshan.farkate@tcognition.com",
      //                  attachLog: true
      //     }
      // }
    }

    stage('build') {
      steps {
        bat "mvn clean install"
        echo "build successfully"
         archiveArtifacts artifacts: "**/target/*.jar"
      }

      //             post {
      //     failure {
      //         emailext subject: "Build Failed: ${currentBuild.fullDisplayName}",
      //                  body: "The build failed. Please check the Jenkins console output for more details.",
      //                  to: "soham.kulkarni@tcognition.com, roshan.farkate@tcognition.com",
      //                  attachLog: true
      //     }
      // }
    }
    stage('deploy'){
    steps{
        powershell 'Copy-Item -Force "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Department Service\\target\\*" "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps" -Recurse'
    echo 'code deployed'
    }
    //      post {
    //     failure {
    //         emailext subject: "Build Failed: ${currentBuild.fullDisplayName}",
    //                  body: "The build failed. Please check the Jenkins console output for more details.",
    //                  to: "soham.kulkarni@tcognition.com, roshan.farkate@tcognition.com",
    //                  attachLog: true
    //     }
    //     success {
    //         emailext subject: "Build Successful: ${currentBuild.fullDisplayName}",
    //                  body: "The build was successful. You can download the artifacts from ${BUILD_URL}",
    //                   to: "soham.kulkarni@tcognition.com, roshan.farkate@tcognition.com",
    //                  attachLog: true
    //     }
     }

  }
}