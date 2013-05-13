package com.grailsinaction

class ReadingItem {
    String isFavourite
    String isRead

    static belongsTo = [resources:Resource]
    static constraints = {  isRead(inList: ["Yes","No"])
    }
}

