package com.xml.read

import org.junit.Test

class ReadXml {

    @Test
    void readXmlFile1(){
        def parser = new XmlSlurper()
        final String filePath = "C:\\Java-Prep\\groovy\\files\\input.xml"
        def doc = parser.parse(filePath)

        // get first profile msisdn
        def msisdn = doc.Body.getProfileResponse_v2.profile[0].MSISDN
        println msisdn

        // get first profile role
        def role = doc.Body.getProfileResponse_v2.profile[0].role
        println role
    }

    @Test
    void readXmlFile2(){
        def parser = new XmlSlurper()
        final String filePath = "C:\\Java-Prep\\groovy\\files\\input.xml"
        println "$filePath"
        def doc = parser.parse(filePath)

        // iterate profiles
        String pahMSISDN = ""
        for(def profile : doc.Body.getProfileResponse_v2.profile){
            String roleCode = "${profile.role}"
            if("PAH".equalsIgnoreCase(roleCode)){
                pahMSISDN = "${profile.MSISDN}"
                break
            }
        }

        println "MSISDN of ROLE PAH = $pahMSISDN"
    }

    @Test
    void readXmlAsStringAndParse(){
        final String filePath = "C:\\Java-Prep\\groovy\\files\\input-xml.txt"
        final File file = new File(filePath)

        final String fileContent = file.text
        def parser = new XmlSlurper()
        def doc = parser.parseText(fileContent)

        // iterate profiles
        String pahMSISDN = ""
        for(def profile : doc.Body.getProfileResponse_v2.profile){
            String roleCode = "${profile.role}"
            if("PAH".equalsIgnoreCase(roleCode)){
                pahMSISDN = "${profile.MSISDN}"
                break
            }
        }

        println "MSISDN of ROLE PAH = $pahMSISDN"
    }
}