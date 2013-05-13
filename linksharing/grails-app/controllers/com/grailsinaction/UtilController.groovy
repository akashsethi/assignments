package com.grailsinaction

class UtilController {

    def index() {def user=User.findByFirstName("jack")
     def read=user.topics.resources.flatten()




       def result=read.readingitems.flatten()
     def lst=[]
        result.each{
            if (it?.isRead=='No'){
                lst.add(it)
            }
        }
          render view: "reading" ,model: [user:lst]

    }
}
