pipeline {
	agent any 
	stages{
	    stage('checkout the code'){
	        steps {
                         checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/saurabhsamarjeet/solution']]])
                           
                     }
              }
        stage('increment the release version'){
            steps {
                 script {
                        def version = readFile "${env.WORKSPACE}/version.txt"
                        println "${version}"
                        def readcounter = version.split('\\.')
                        readcounter[2]=(readcounter[2]).toInteger() +1
                        def newversion=readcounter.join('.')
                        println "${newversion}"
			writeFile(file: 'version.txt', text:newversion.toString())
        }}
	}}
}
