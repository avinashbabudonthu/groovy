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
}
