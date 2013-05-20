package com.grailsinaction

import org.codehaus.groovy.grails.web.servlet.mvc.GrailsParameterMap
import javax.security.sasl.AuthorizeCallback
import grails.validation.ValidationException
import org.grails.datastore.mapping.validation.ValidationException
import java.text.DateFormat

class UserService {

    UserService() {
        println "hello"
    }

    def serviceMethod() {

    }

    def register(RegisterCommand registerCommand, GrailsParameterMap params) {
        def u = new User()
        u.properties = params
        u.save(failOnError: true)
    }

    def util() {
        Date date=Date.parse("dd-MMM-yyyy","23-aug-1994")
        User user3=new User(email: "pawan@hotmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "pawan",
                lastName: "kalis",gender: "male",dateOfBirth: date)
        User user4=new User(email: "sharukh@hotmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "shahrukh",
                lastName: "khurana",gender: "male",dateOfBirth: date)
        Topic topic5=new Topic(name: "intelligrape",owner: "jack",visibility: "PUBLIC")
        Topic topic6=new Topic(name: "cricket",owner: "saurav",visibility: "PUBLIC")
        Subscription subscription5=new Subscription(subscriber: "jack",seriousness: "CASUAL",topic: "intelligrape")
        Subscription subscription6=new Subscription(subscriber: "saurav",seriousness: "CASUAL",topic: "cricket")
        user3.addToSubscriptions(subscription5).save()
        user3.addToTopics(topic5) .save()
        user4.addToSubscriptions(subscription6) .save()
        user4.addToTopics(topic6).save()
        topic5.addToResources(new LinkResource(url: "http://www.google.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic5.addToResources(new LinkResource(url: "http://www.intelligrape.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic5.addToResources(new LinkResource(url: "http://www.yahoo.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic5.addToResources(new LinkResource(url: "http://www.facebook.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic5.addToResources(new LinkResource(url: "http://www.codehaus.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic5.addToResources(new LinkResource(url: "http://www.times.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic6.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic6.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic6.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic6.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic6.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic6.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        if((!user3.validate())||(!user4.validate())){
            throw new RuntimeException("error occured")
        }
        def user = User.findByFirstName("jack")
        def read = user.topics.resources.flatten()
        def result = read.readingitems.flatten()
        def lst = []
        result.each {
            if (it?.isRead == 'No') {
                lst.add(it)
            }
        }
        return lst
    }

    def save() {
        Date date = Date.parse("dd-MMM-yyyy", "18-apr-1991")
        User u1 = new User(email: "abcde@hotmail.com", password: "igdefault", conformPassword: "igdefault", firstName: "abcd",
                lastName: "kalis", gender: "male", dateOfBirth: date)
        if(!u1.validate()){
            throw new RuntimeException("an error occured while saving please retry")
        }
        u1.save()

    }


}
