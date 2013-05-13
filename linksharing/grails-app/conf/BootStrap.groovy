import com.grailsinaction.*
class BootStrap {

    def init = { servletContext ->
          User user1=new User(email: "vivek@gmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "abc",
          lastName: "kumar",gender: "male",dateOfBirth: "18-apr-1990")
        Subscription subscription1=new Subscription(subscriber: "abc",seriousness: "CASUAL",topic: "java")
        user1.addToSubscriptions(subscription1)
        Subscription subscription2=new Subscription(subscriber: "abc",seriousness: "CASUAL",topic: "grovy")
        user1.addToSubscriptions(subscription2)
        Topic topic1=new Topic(name: "grails",owner: "abc",visibility: "PUBLIC")
        Topic topic2=new Topic(name: "magento",owner: "abc",visibility: "PUBLIC")
        user1.addToTopics(topic1)
        user1.addToTopics(topic2)
        user1.save(failOnError: true)

        User user2=new User(email: "akash@intelligrape.com",password: "igdefault",conformPassword: "igdefault",firstName: "akash",
                lastName: "sethi",gender: "male",dateOfBirth: "08-apr-1990")
        Subscription subscription3=new Subscription(subscriber: "akash",seriousness: "CASUAL",topic: "grails")
        user2.addToSubscriptions(subscription3)
        Subscription subscription4=new Subscription(subscriber: "akash",seriousness: "CASUAL",topic: "magento")
        user2.addToSubscriptions(subscription4)
        Topic topic3=new Topic(name: "java",owner: "abc",visibility: "PUBLIC")
        user2.addToTopics(topic3)
        Topic topic4=new Topic(name: "groovy",owner: "abc",visibility: "PUBLIC")
        user2.addToTopics(topic4)
        user2.save(failOnError: true)
        topic1.addToSubscriptions(subscription1)
        topic1.addToSubscriptions(subscription2)
        topic1.addToSubscriptions(subscription3)
        topic1.addToSubscriptions(subscription4)
        topic2.addToSubscriptions(subscription1)
        topic2.addToSubscriptions(subscription2)
        topic2.addToSubscriptions(subscription3)
        topic2.addToSubscriptions(subscription4)
        topic3.addToSubscriptions(subscription1)
        topic3.addToSubscriptions(subscription2)
        topic3.addToSubscriptions(subscription3)
        topic3.addToSubscriptions(subscription4)
        topic4.addToSubscriptions(subscription1)
        topic4.addToSubscriptions(subscription2)
        topic4.addToSubscriptions(subscription3)
        topic4.addToSubscriptions(subscription4)
        def resource1=new Resource(title: "grails")
        def resource2=new Resource(title: "magento")
        def resource3=new Resource(title: "jave")
        def resource4= new Resource(title: "groovy")
        topic1.addToResources(resource1)
        topic2.addToResources(resource2)
        topic3.addToResources(resource3)
        topic4.addToResources(resource4)
        resource1.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No")).save(failOnError: true)
        resource2.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No")).save(failOnError: true)
        resource3.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "Yes")).save(failOnError: true)
        resource4.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No")).save(failOnError: true)



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
    def destroy = {
    }
}
