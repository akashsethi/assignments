package com.grailsinaction

class LsTagLib {
    static namespace = "ls"
    def unreadItems={attr,body->

    }
    def subscribedTopics={attr,body->
       def sub=attr.subs

        sub?.each{num->
           out<< body(i:num)
        }

    }

    def dateFormat = { attr,body ->
        out << new java.text.SimpleDateFormat("dd-MM-yyyy").format(attr.value)

    }

     def ownedTopic={attr,body->
         def user_list=attr.listTopic
       user_list.each{i->
           out<<body(val:i)
       }
     }
}
