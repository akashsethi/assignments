package com.grailsinaction

class DocumentResource {
    String fileName
    String contentType
    static constraints = {
        fileName (blank:false)
        contentType (blank:false)
    }
}
