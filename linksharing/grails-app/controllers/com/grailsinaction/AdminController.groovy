package com.grailsinaction

class AdminController {
    def beforeInterceptor =  [action:this .&auth]
    private auth(){
        if(!session.user){
            flash.message="not authorized"
            redirect(controller:"user",action:"login")
        }
    }
     def admin(){}
    def index() { }
    def stats(){

        def user=User.list()


       render (view:"stats",model:[user:user])





    }
}
