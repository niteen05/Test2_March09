node{
   stage('SCM-Checkout'){
     echo 'Check Out : Start';
     git 'https://github.com/niteen05/Test2_March09'
     echo 'Checked Out : End';
   }
   stage('Compile-Package'){
      echo 'Compile-Package : Start';
      // Get maven home path
      def mvnHome =  tool name: 'maven3_6', type: 'maven'   
      sh "${mvnHome}/bin/mvn package"
      echo 'Compile-Package : End';
   }   
   stage('SonarQube-Analysis') {
        echo 'SonarQube-Analysis : Start';
        def mvnHome =  tool name: 'maven3_6', type: 'maven'
        withSonarQubeEnv('sonar') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
        echo 'SonarQube-Analysis : End';
    }
  }