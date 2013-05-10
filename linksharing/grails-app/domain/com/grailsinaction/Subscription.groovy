package com.grailsinaction

class Subscription {
    String subscriber
  //  Date dateCreated
   // Date lastUpdated
    String seriousness
    String topic
    static belongsTo =[users:User]
    static mapping = {
        version(false)
        subscriber(column: 'subscriberName')
    }
    static constraints = {
        seriousness ( inList: ["CASUAL", "SERIOUS", "VERY_SERIOUS"])
    }
}
