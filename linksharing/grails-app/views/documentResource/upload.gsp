<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 16/5/13
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
  <title></title>
</head>
<body>
     ${topicId.name}
 <h3>upload Document</h3>
<g:uploadForm action="uploadDocument">
    <g:hiddenField name="id" value="${topicId.id}"></g:hiddenField>
    <div><label>Title</label><g:textField name="title"></g:textField></div>
    <div><input type="file" name="fileName"></div>
    <div><g:submitButton name="upload"/></div>
</g:uploadForm>
</body>
</html>