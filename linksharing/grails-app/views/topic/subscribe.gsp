<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 18/5/13
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
  <title>subscribe</title>
</head>
<body>
    <g:form name="subscribe" action="subscribeTopicSave">
    <g:hiddenField name="subscriber" value="${user}"/>
    <div><label>Select a Topic</label><g:select name="topic" from="${topicLIst.name}"></g:select> </div>
    <div><label>Seriousness</label><g:select name="seriousness" from="['CASUAL', 'SERIOUS', 'VERY_SERIOUS']"></g:select> </div>
    <div><g:submitButton name="save" value="subscribe"/></div>
    </g:form>
</body>
</html>