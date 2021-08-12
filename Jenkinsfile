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
        deploy "server1"
    }
}