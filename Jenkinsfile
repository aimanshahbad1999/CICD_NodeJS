@Library('CICD_Node_lib@master')

import com.exm.CICD
def buildObj=new CICD()

node{
    stage("Git Clone"){
        gitClone "https://github.com/aimanshahbad1999/docker-asg.git"
    }

    stage("Build"){
        buildObj.build("docker-asg.zip")
        
    }
    
    stage("Deploy"){
        print("Deploy Stage")
        sshPublisher(publishers: [sshPublisherDesc(configName: 'server1', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '/', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '**/*.zip')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
         }
}