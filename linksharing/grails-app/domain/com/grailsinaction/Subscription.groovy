package com.grailsinaction

class Subscription {
    String subscriber
    Date dateCreated
    Date lastUpdated
    String seriousness
    String topic
   //static belongsTo = [users:User ,topics:Topic ]
    static constraints = {
        seriousness ( inList: ["CASUAL", "SERIOUS", "VERY_SERIOUS"])
    }
}
