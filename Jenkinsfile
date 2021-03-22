node{
    stage("Git Clone"){
        deleteDir()
        print("Git Clone")
        checkout([$class: 'GitSCM', branches: [[name: 'main']],
        userRemoteConfigs: [[url: 'https://github.com/aimanshahbad1999/docker-asg.git']]])
        def addr=pwd()
        print(pwd)
        sh "ls"
    }
    stage("Build"){
        zip archive: true, dir: '', glob: '', zipFile: 'docker-asg.zip'
    }
    
    stage("Deploy"){
        print("Deploy Stage")
        sshPublisher(publishers: [sshPublisherDesc(configName: 'server1', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '/', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '**/*.zip')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
         }
}