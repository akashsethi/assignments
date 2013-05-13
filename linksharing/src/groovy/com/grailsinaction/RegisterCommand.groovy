package com.grailsinaction
 import grails.validation.Validateable
/**
 * Created with IntelliJ IDEA.
 * User: akash
 * Date: 13/5/13
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Validateable
class RegisterCommand {


        String email
        String firstName
        String lastName
        static constraints = {
            email(email: true, nullable: false,blank: false)
            firstName(blank: false)
            lastName(blank: false)

        }
    }
