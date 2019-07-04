package com.read.file

import org.junit.Test

class ReadFile {

    @Test
    void readAllContentOfFileFromAbsolutePath(){
        final String filePath = "C:\\Java-Prep\\groovy\\files\\input-xml.txt"
        final File file = new File(filePath)

        final String fileContent = file.text
        println "$fileContent"
    }

    @Test
    void displayFilesInADirectory(){
        final String directoryPath = "E:\\Backup\\Java-Prep\\groovy\\projects\\groovy\\file-io\\src\\test\\java\\com\\read\\file"
        final File filePath = new File(directoryPath)
        filePath.eachFile {file -> println "${file.getAbsolutePath()}"}
    }

    @Test
    void displayFilesInDirectoryAndSubDirectory(){
        final String directoryPath = "E:\\Backup\\Java-Prep\\groovy\\projects\\groovy\\file-io\\src\\test\\java"
        final File filePath  = new File(directoryPath)
        filePath.eachFileRecurse {file -> println "${file.getAbsolutePath()}"}
    }
}
