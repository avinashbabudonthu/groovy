package com.groovy

import org.junit.Test

class ReadFile {

    /**
     * 1. Give absolute file path
     * 2. Read all the content of file
     * 3. print all the content of file
     */
    @Test
    void readAllContentOfFileFromAbsolutePath(){
        final String filePath = "C:\\Java-Prep\\groovy\\files\\input-xml.txt"
        final File file = new File(filePath)

        final String fileContent = file.text
        println "$fileContent"
    }

    @Test
    void exists(){
        final String filePath = "C:\\Java-Prep\\groovy\\files\\input-xml.txt"
        final File file = new File(filePath)

        println "Is file exist? - ${file.exists()}"
    }

    /**
     * 1. Display files in a directory
     */
    @Test
    void displayFilesInADirectory(){
        final String directoryPath = "E:\\Backup\\Java-Prep\\groovy\\projects\\groovy\\file-io\\src\\test\\java\\com\\read\\file"
        final File filePath = new File(directoryPath)
        filePath.eachFile {file ->
            println "${file.getAbsolutePath()}"
        }
    }

    /**
     * 1. Display files in a directory and sub directory
     * 2. Use eachFileRecurse
     */
    @Test
    void displayFilesInDirectoryAndSubDirectory(){
        final String directoryPath = "E:\\Backup\\Java-Prep\\groovy\\projects\\groovy\\file-io\\src\\test\\java"
        final File filePath  = new File(directoryPath)
        filePath.eachFileRecurse {file ->
            println "${file.getAbsolutePath()}"
        }
    }
}
