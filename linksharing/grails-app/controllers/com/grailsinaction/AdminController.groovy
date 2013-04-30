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

        def countUser=User.list()
  //      List<User>lst=new ArrayList<User>()
    //    lst<<countUser.subscriptions .count()
    //    def countSubscription=User.count()

       render (view:"stats",model:['c1':countUser])
     // render lst




    }
}
