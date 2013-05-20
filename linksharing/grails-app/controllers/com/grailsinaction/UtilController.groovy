package com.grailsinaction

class UtilController {
    def userService
    def index() {
        try{
          render view: "reading" ,model: [user:userService.util()]
        }
        catch (Exception e){
            render e.getMessage()
        }
    }
}
