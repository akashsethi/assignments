<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 15/5/13
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
  <title>new topic</title>
</head>
<body>
<div style="width: 200px">
    <g:form name="newTopic" action="topicValidate">
        <g:hiddenField name="id" value="${userId.id}"/>
        <g:hiddenField name="owner" value="${userId.firstName}"/>
     <div>   <label>Topic Name</label><g:textField name="name"/> </div>
     <div>   <label>visibility</label><g:select name="visibility" from="['PUBLIC','PRIVATE']"></g:select> </div>
        <div><g:submitButton name="save" value="save"/> </div>
    </g:form>
</div>
</body>
</html>