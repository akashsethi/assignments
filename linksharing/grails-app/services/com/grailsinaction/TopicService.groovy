package com.grailsinaction

import org.codehaus.groovy.grails.web.servlet.mvc.GrailsParameterMap

class TopicService {
    TopicService(){

    }
    // static transactional = false
    def serviceMethod() {

    }
    def topic(TopicCommand cmd,GrailsParameterMap params){

        cmd.validate(params)

    }
    def topicCreate(GrailsParameterMap params){
        Topic topic=new Topic(params)
        def user=User.findById(params.id)
        user.addToTopics(topic).save()
        user.addToSubscriptions(new Subscription(subscriber:params.owner,seriousness: 'CASUAL',topic: params.name)).save()

    }
}
