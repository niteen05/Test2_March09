node{
   stage('SCM-Checkout'){
     echo 'Check Out : Start';
     git 'https://github.com/niteen05/Test2_March09'
     echo 'Checked Out : End';
   }
   stage('Build-Compile'){
      echo 'Build-Compile : Start';
      // Get maven home path
      def mvnHome =  tool name: 'maven3_6', type: 'maven'   
      sh "${mvnHome}/bin/mvn compile"
      echo 'Build-Compile : End';
   }   
   try {
       	stage('Test-Junits') {
   			echo 'Test-Junits : Start';
      		// Get maven home path
      		def mvnHome =  tool name: 'maven3_6', type: 'maven'   
      		sh "${mvnHome}/bin/mvn test"
      		echo 'Test-Junits : End';
       	}
   } finally {
       	junit '**/surefire-reports/*.xml'
   }
   stage('SonarQube-Analysis') {
        echo 'SonarQube-Analysis : Start';
        def mvnHome =  tool name: 'maven3_6', type: 'maven'
        withSonarQubeEnv('sonar') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
        echo 'SonarQube-Analysis : End';
    }
   stage('Package'){
      echo 'Package : Start';
      // Get maven home path
      def mvnHome =  tool name: 'maven3_6', type: 'maven'   
      sh "${mvnHome}/bin/mvn package -Dskiptests"
      echo 'Package : End';
   }
  }