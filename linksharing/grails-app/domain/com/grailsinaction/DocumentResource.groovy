package com.grailsinaction

class DocumentResource extends Resource{
    byte[] fileName
    //String contentType
    static constraints = {
        fileName(maxSize: 1024*1024*2)
       // contentType (blank:false)
    }
}
