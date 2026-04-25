
pipeline {

    agent any

    stages {

        stage('Code Pull') {

            steps {

                echo 'GitHub se Code Pull Ho Raha Hai...'

            }

        }

        stage('Build') {

            steps {

                echo 'Build Successful!'

            }

        }

        stage('Docker Image Build') {

            steps {

                bat 'docker build -t learningdemo .'

            }

        }

        stage('Docker Deploy') {

            steps {

                bat 'docker run -d -p 9090:9090 learningdemo'

            }

        }

    }

    post {

        success {

            echo 'Pipeline Successfully Complete!'

        }

        failure {

            echo 'Pipeline Failed!'

        }

    }

}

