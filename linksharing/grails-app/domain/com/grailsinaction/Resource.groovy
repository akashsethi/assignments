package com.grailsinaction

class Resource {
    String title
   // String brief

    static hasMany = [readingitems:ReadingItem]

    static constraints = {

    }
    static mapping = {

    }
}
