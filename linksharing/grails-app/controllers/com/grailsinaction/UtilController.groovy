package com.grailsinaction

class UtilController {

    def index() {def user=User.findByFirstName("akash").firstName
        def read=ReadingItem.findAllByUserAndIsRead(user,"yes").size()
     render read
   // render user.getClass()
    }
}
