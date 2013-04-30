package com.grailsinaction

class User {
    String email
    String password
    String firstName
    String lastName
    String gender
    Date dateOfBirth
    Date dateCreated
    Date lastUpdated
    static hasMany = [subscriptions: Subscription, topics: Topic]
    static constraints = {
        email(email: true, unique: true, blank: false, nullable: false)
        firstName(blank: false)
        lastName(blank: false)
        password(size: 6..12)
        gender(inList: ["male", "female"])
        dateOfBirth (nullable: true)
    }
}
