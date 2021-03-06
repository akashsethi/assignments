package com.grailsinaction

import javax.swing.JOptionPane

class UserController {
    def userService
    def topicService
    def scaffold=true
    def readingitem(){
        if (session.user){
            //  def readingitem=ReadingItem.findAllByUserAndIsRead(session.user,"yes")
            //  render(template: "/user/readingitem",model: [r:readingitem])
            def user_find=User.findByFirstName(session.user)
            def reading_item=user_find.topics.resources.readingitems.flatten()
            render(view: "_readingitem",model: [readingitem:reading_item])
            //  render reading_item.flatten()
        }
        else{
            render view: "login"
        }
    }
    def dashboard(){

        if (session.user) {
            def userId=User.findByFirstName(session.user)
            session.userId=userId
            def user_find=User.findByFirstName(session.user)
                    def subscriber=user_find.subscriptions
            def topic=user_find.topics
            render (view: "home" ,model:[ownedtopic:topic,c2:subscriber] )

        }
        else{
            render view: "login"
        }
    }
    def register(){
        render view:"_register"
    }
    def reRegister(){
        render view: "_register"
    }
    def login(){ }
    def logout(){//session.user=null
        session.invalidate()
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

    def registration(RegisterCommand registerCommand ){

        try{
            userService.register(registerCommand,params)
            render view: "login"
        }
        catch (Exception e){
            e.printStackTrace(System.out)
            render view: "_register" ,model: [er:registerCommand]
        }
    }
    def passwordChange(){
        render view: "passwordReset"
    }
    def passwordReset(){
        def user=User.findByEmail(params.email)
        if (user){
            render view: "setpassword",model: [useremail:user.id]
        }
        else{
            flash.message="invalid email"
            render view: "passwordReset"
        }
    }
    def savePassword(){
        def userFind=User.get(params.id)
        userFind.properties=params
        if (userFind.validate()){
            userFind.save()
            render view: "login"
        }
        else {
            render view: "setpassword"
        }
    }

    def userCreate(){
        try{
            userService.save()
            render "saved"
        }
        catch (Exception e){

            render e.getMessage()
        }
    }


}



