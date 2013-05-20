package com.grailsinaction

class BootstrapService {
     BootstrapService(){
         println "hello"
     }
    def serviceMethod() {

    }
    def bootstrap() {
        User user1=new User(email: "akash@hotmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "akash",
                lastName: "sethi",gender: "male",dateOfBirth: "18-apr-1990")
        User user2=new User(email: "kunal@hotmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "kunal",
                lastName: "khurana",gender: "male",dateOfBirth: "18-apr-1985")
        Topic topic1=new Topic(name: "intelligrape",owner: "jack",visibility: "PUBLIC")
        Topic topic2=new Topic(name: "cricket",owner: "saurav",visibility: "PUBLIC")
        Subscription subscription1=new Subscription(subscriber: "jack",seriousness: "CASUAL",topic: "intelligrape")
        Subscription subscription2=new Subscription(subscriber: "saurav",seriousness: "CASUAL",topic: "cricket")
        user1.addToSubscriptions(subscription1).save()
        user1.addToTopics(topic1) .save()
        user2.addToSubscriptions(subscription2) .save()
        user2.addToTopics(topic2).save()
        topic1.addToResources(new LinkResource(url: "http://www.google.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic1.addToResources(new LinkResource(url: "http://www.intelligrape.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic1.addToResources(new LinkResource(url: "http://www.yahoo.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic1.addToResources(new LinkResource(url: "http://www.facebook.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic1.addToResources(new LinkResource(url: "http://www.codehaus.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic1.addToResources(new LinkResource(url: "http://www.times.com",title: "intelligrape")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic2.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic2.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic2.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic2.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic2.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)
        topic2.addToResources(new LinkResource(url: "http://www.google.com",title: "cricket")
                .addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No"))).save(failOnError: true)



        User user3=new User(email: "jack@hotmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "jack",
                lastName: "kalis",gender: "male",dateOfBirth: "18-apr-1990")
        User user4=new User(email: "saurav@hotmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "saurav",
                lastName: "khurana",gender: "male",dateOfBirth: "18-apr-1985")
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




    }
}
