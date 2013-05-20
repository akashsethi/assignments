package com.grailsinaction

class TopicController {
    def topicService

      def scaffold=true
      def topicDetail(){
      }
      def createTopic(){
          def user=User.findByFirstName(session.user)

          render view:"newTopic" ,model: [userId:user]
      }
      def topicValidate(){
        try{
        topicService.topicCreate(params)
            redirect(controller: "user",action: "dashboard")
        }
        catch (Exception e){
            render e.message
        }
      }
      def inviteTopic(TopicCommand cmd){
          try{
             topicService .topic(cmd,params)
              println ">>>>>>>>>>>>>"
              render "invite send"
          }
          catch (Exception e){
             // e.printStackTrace(System.out)
              render view: "topicDetail",model: [er:cmd]
          }

      }
    def viewTopic(){
        def topic=params.name
        def topic1=Topic.findByName(topic)

        def read = topic1.resources.findAll {it.instanceOf(LinkResource)}.flatten()


        def result = read.readingitems.flatten()
      def lst = []
        result.each {
            if (it?.isRead == 'No') {
                lst.add(it)
            }
        }
        def res=topic1.resources.findAll{it.instanceOf(DocumentResource)}
        // render "${lst}"
       render view: "viewTopic" ,model:[topicId:topic1,links:lst,document:res]
    }

    def subscribeTopic(){
        def user=session.user
        def topicList=Topic.list().findAll {it.visibility=='PUBLIC'}
        render view: 'subscribe' ,model: ['topicLIst':topicList,'user':user]
    }
    def subscribeTopicSave(){
        def user=User.findByFirstName(params.subscriber)
        user.addToSubscriptions(new Subscription(subscriber: params.subscriber,topic: params.topic,seriousness: params.seriousness))
            .save(failOnError: true)
        redirect(controller: 'user',action: 'dashboard')
    }
    def download(){
    def file = new File("home/akash/akki.txt")

    if (file.exists()) {
        response.setContentType("application/octet-stream")
        response.setHeader("Content-disposition", "filename=${file.name}")
        response.outputStream << file.bytes
        return
    }
    }
    def MaxSubscribed(){
        def topic=Topic.findAllByVisibility('PUBLIC')
        println topic*.name
        def t=topic.collect {it.subscriptions}.topic.sort().reverse()
        render t

    }

}
