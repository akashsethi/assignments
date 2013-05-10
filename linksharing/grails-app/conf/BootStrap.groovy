import com.grailsinaction.*
class BootStrap {

    def init = { servletContext ->
          def user1=new User(email: "vivek@gmail.com",password: "igdefault",conformPassword: "igdefault",firstName: "abc",
          lastName: "kumar",gender: "male",dateOfBirth: "18-apr-1990")
        def subscription1=new Subscription(subscriber: "abc",seriousness: "CASUAL",topic: "java")
        user1.addToSubscriptions(subscription1)
        def subscription2=new Subscription(subscriber: "abc",seriousness: "CASUAL",topic: "grovy")
        user1.addToSubscriptions(subscription2)
        def topic1=new Topic(name: "grails",owner: "abc",visibility: "PUBLIC")
        def topic2=new Topic(name: "magento",owner: "abc",visibility: "PUBLIC")
        user1.addToTopics(topic1)
        user1.addToTopics(topic2)
        user1.save(failOnError: true)

        def user2=new User(email: "akash@intelligrape.com",password: "igdefault",conformPassword: "igdefault",firstName: "akash",
                lastName: "sethi",gender: "male",dateOfBirth: "08-apr-1990")
        def subscription3=new Subscription(subscriber: "akash",seriousness: "CASUAL",topic: "grails")
        user2.addToSubscriptions(subscription3)
        def subscription4=new Subscription(subscriber: "akash",seriousness: "CASUAL",topic: "magento")
        user2.addToSubscriptions(subscription4)
        def topic3=new Topic(name: "java",owner: "abc",visibility: "PUBLIC")
        user2.addToTopics(topic3)
        def topic4=new Topic(name: "groovy",owner: "abc",visibility: "PUBLIC")
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
        def resource1=new Resource(title: "grails",summaryy: "welcome to grails")
        def resource2=new Resource(title: "magento",summaryy: "welcome to magento")
        def resource3=new Resource(title: "jave",summaryy: "welcome to java")
        def resource4= new Resource(title: "groovy",summaryy: "welcome to groovy")
        topic1.addToResources(resource1)
        topic2.addToResources(resource2)
        topic3.addToResources(resource3)
        topic4.addToResources(resource4)
        resource1.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No")).save(failOnError: true)
        resource2.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No")).save(failOnError: true)
        resource3.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "Yes")).save(failOnError: true)
        resource4.addToReadingitems(new ReadingItem(isFavourite: "YES",isRead: "No")).save(failOnError: true)

        //topic1.addToSubscriptions(new Subscription(subscriber: "kapil",seriousness: "SERIOUS",topic: "grails")).save(failOnError: true)
       // topic1.addToSubscriptions(new Subscription(subscriber: "himanshi",seriousness: "SERIOUS",topic: "grails"))
        //topic2.addToSubscriptions(new Subscription(subscriber: "sanjay",seriousness: "CASUAL",topic: "grails"))
    }
    def destroy = {
    }
}
