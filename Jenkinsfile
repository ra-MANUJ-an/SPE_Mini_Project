pipeline {
    // The “agent” section configures on which nodes the pipeline can be run.
    // Specifying “agent any” means that Jenkins will run the job on any of the
    // available nodes.

	agent any

    stages {
        stage('Git Pull') {
            steps {
                // Get code from a GitHub repository
				git url: 'https://github.com/ayushdas2000/SPE_project.git',
				branch: 'main',
                credentialsId: 'GitCredential'
            }
        }
        stage('Maven Build') {
            steps {
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Images') {
            steps {
                sh 'docker build -t lazytux/calc_proj:latest .'
            }
        }
        stage('Publish Docker Images') {
            steps {
                withDockerRegistry([ credentialsId: "dockerid", url: "" ]) {
                    sh 'docker push lazytux/calc_proj:latest'
                }
            }
        }
        stage('Clean Docker Images') {
            steps {
                sh 'docker rmi -f lazytux/calc_proj:latest'
            }
        }
        stage('Deploy and Run Image'){
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible',
                 inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }

    }

    post {
        always {
            sh 'docker logout'
        }
    }
}
