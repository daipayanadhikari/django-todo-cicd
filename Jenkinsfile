pipeline{
  
  agent any
  
  stages{
    stage("build"){
      steps{
//         sh 'npm install' 
//         sh 'npm build'
        echo 'Building The Application...'
      }
    }
    
   stages{
    stage("test"){
      steps{
        echo 'Testing The Application...'
      }
    }
     
   stages{
    stage("deploy"){
      steps{
        echo 'Deploying The Application...'
      }
    }
 
  }
}
