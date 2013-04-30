package com.grailsinaction

class UserController {
      def scaffold=true
    def readingitem(){
        if (session.user){
            def readingitem=ReadingItem.findAllByUserAndIsRead(session.user,"yes")
            render(template: "/user/readingitem",model: [r:readingitem])

        }
        else{
            render view: "login"
        }
    }
    def dashboard(){
        if (session.user) {
            def subscriber=Subscription.findBySubscriber(session.user)
            def topic=Topic.findByOwner(session.user)
        render (view: "home" ,model:[c1:topic,c2:subscriber] )

        }
        else{
            render view: "login"
        }
    }
    def login(){ }
    def logout(){session.user=null
    flash.message="sign in again"
    redirect(action:"login")
    }
    def loginHandler(){
        if(params .username=="admin" && params .password=="igdefault"){
            session.user="Admin"
            redirect (controller:"admin",action:"admin")
        }
        else if(User.findByFirstName (params.username)&&User.findByPassword (params.password))
        {
            //def u=User.findByFirstName(params.username)
           session.user= params.username
            redirect(controller: "user",action: "dashboard")
        }
        else{
            flash.message="invalid username/password"
            render (view:"login")
        }

    }

    //def index() { }
}
