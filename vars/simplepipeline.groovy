def call(){
    pipeline{
        agent any
        environment {
            module = 'M4'
        }

        stages{
            stage('First Stage'){
                steps{
                    echo "Module is ${module}"
                    pwsh 'git version'
                }
            }
        }
    }
}