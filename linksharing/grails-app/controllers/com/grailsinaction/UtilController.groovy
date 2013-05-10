package com.grailsinaction

class UtilController {

    def index() {def user=User.findByFirstName("akash")
     def read=user.topics.resources
  def reading=   read.collect{it.readingitems}
    render reading
   // render user.getClass()
    }
}
