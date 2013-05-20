package com.grailsinaction

class DocumentResourceController {
     def scaffold=true
   // def index() { }
    def upload(){
         def topicId=Topic.findByName(params.topicId)

        render view: "upload" ,model: [topicId:topicId]
    }
    def uploadDocument(){

     def topic=Topic.findById(params.id)
   //     def file=params.fileName

       topic.addToResources(new DocumentResource(title: params.title, fileName: params.fileName)).save(failOnError: true)

       //render file.inputStream.text
        redirect(controller: 'user', action: 'dashboard')

        }
   /* def getFile(){
        def content=DocumentResource.get(26)
        response.contentType=content.contentType
        response.setHeader("Content-disposition","attachment;filename="+content.fileName)
        response.contentLength=content.size
        response.outputStream<<content.file
        response.outputStream.flush()
    } */
}