#!/usr/bin/env groovy

package com.exm

public class CICD{
    def build(filename){
        zip archive: true, dir: '', glob: '', zipFile: filename
    }
    
}