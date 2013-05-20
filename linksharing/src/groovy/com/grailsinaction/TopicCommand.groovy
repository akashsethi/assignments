package com.grailsinaction
import grails.validation.Validateable
/**
 * Created with IntelliJ IDEA.
 * User: akash
 * Date: 14/5/13
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Validateable
class TopicCommand {
    String email1
    String email2
    String email3
    String email4
    String email5
    static constraints={
        email1(email: true,blank: false)
        email2(email: true,blank: false)
        email3(email: true)
        email4(email: true)
        email5(email: true)

    }
}
