package com.grailsinaction

class Topic {
    String name
    String owner
    String visibility
   // static belongsTo = [users:User]
    static hasMany = [subscriptions:Subscription ,resources:Resource ]
    static constraints = {
        name(blank:false,unique:true)
        visibility (inList:["PUBLIC","PRIVATE"])
    }
}
