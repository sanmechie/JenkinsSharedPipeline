def call(Map config){
    pipeline{
        agent any
        stages{
            stage('Windows'){
                when {
                    expression{
                        config.OS == 'true'
                    }
                    
                }
                steps{
                    echo 'Running windows'
                }
            }
             stage('Linux'){
                when {
                    expression{
                        config.OS == 'false'
                    }
                    
                }
                steps{
                    echo 'Running windows'
                }
            }

            stage('Always'){
 
                steps{
                    echo "Printing ${config.OS}"
                }
            } 


        }
    }
}