package com.grailsinaction

class Resource {
    String title
    String summaryy
    Date dateCreated
    Date lastUpdated
   // static belongsTo = [topics:Topic ]
    static hasMany = [readingitems:ReadingItem ]
    static constraints = {   summaryy (maxSize:1024)
    }
}