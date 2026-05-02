pipeline {
    agent any

    stages {

        stage('Code Pull') {
            steps {
                echo 'GitHub se Code Pull Ho Raha Hai...'
            }
        }

        stage('Start Selenium Grid') {
            steps {
                bat 'docker-compose up -d'
                sleep(time: 15, unit: 'SECONDS')
                echo 'Selenium Grid Ready!'
            }
        }

        stage('Docker Image Build') {
            steps {
                bat 'docker build -t learningdemo .'
            }
        }

        stage('Run Tests in Container') {
            steps {
                bat 'docker run --network=host learningdemo'
            }
        }

        stage('Stop Selenium Grid') {
            steps {
                bat 'docker-compose down'
            }
        }

    }

    post {
        success {
            echo '✅ Pipeline Successfully Complete!'
        }
        failure {
            echo '❌ Pipeline Failed!'
        }
    }
}