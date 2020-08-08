def call (Map config){
    node {
        if ( Integer.parseInt(config.message) < 20){
            return 10
        } else{
            return 20
        }
    }
}