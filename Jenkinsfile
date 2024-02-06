pipeline {
    agent any
    
    // environment {
    //     JAVA_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_271' // Update with your JDK path
    //     MAVEN_HOME = 'C:\\apache-maven-3.6.3' // Update with your Maven path
    //     PATH = "${env.PATH};${JAVA_HOME}\\bin;${MAVEN_HOME}\\bin"
    // }

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Spring Boot application using Maven
                bat "mvn clean package"
            }
        }

        // stage('Test') {
        //     steps {
        //         // Run tests if required
        //         bat "mvn test"
        //     }
        // }

        // stage('Deploy') {
        //     steps {
        //         // Deploy the Spring Boot application (e.g., copy the JAR file)
        //         bat "xcopy target\\your-application.jar C:\\path\\to\\deployment\\directory"
        //     }
        // }

        // stage('Start Application') {
        //     steps {
        //         // Start the Spring Boot application
        //         bat "java -jar C:\\path\\to\\deployment\\directory\\your-application.jar"
        //     }
        // }
    }

    post {
        always {
            // Cleanup or perform any other tasks needed
        }
    }
}
