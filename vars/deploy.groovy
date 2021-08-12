#!/usr/bin/env groovy

def call(name){
     sshPublisher(publishers: [sshPublisherDesc(configName: name, transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '/', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '**/*.zip')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
}