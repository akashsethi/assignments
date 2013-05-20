package com.grailsinaction

class ApplicationFilters {

    def filters = {
        all(controller:'user', action:'*') {
            before = {
                if(!session.user && !actionName.equals("loginHandler")&& !actionName.equals("login")
                        && !actionName.equals("register")&& !actionName.equals("registration")){
                    flash.message="Not signed"
                    redirect(controller: 'user',action: 'login')
                    return false
                }

            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
