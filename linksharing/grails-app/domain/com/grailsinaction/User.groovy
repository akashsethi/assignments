package com.grailsinaction

class User {
    String email
    String password
    String conformPassword
    String firstName
    String lastName
    String gender
    Date dateOfBirth
  //  Date dateCreated
   // Date lastUpdated
    static hasMany = [subscriptions: Subscription, topics: Topic]
    static constraints = {
        email(email: true, unique: true, blank: false, nullable: false)
        firstName(blank: false)
        lastName(blank: false)
        password(size: 6..12)
        gender(inList: ["male", "female"])
        dateOfBirth (nullable: true)
        conformPassword(validator: {val,obj->
            if(val?.equals(obj.password)){
                return true
            }
            else {
                return false
            }
        })
    }
}
