def call (Map config){
    node {
        if ( config.message < 20){
            return 10
        } else{
            return 20
        }
    }
}