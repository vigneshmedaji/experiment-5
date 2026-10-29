pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing the application'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment stage completed'
            }
        }
    }
}



//Expected Output:

//Building the application
//Testing the application
//Deployment stage completed
//Finished: SUCCESS
