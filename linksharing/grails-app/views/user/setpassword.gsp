<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 14/5/13
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
  <title></title>
</head>
<body>
       <g:form name="" action="savePassword">
        <g:hiddenField name="id" value="${useremail}"></g:hiddenField>
        <label>password</label>   <g:textField name="password"></g:textField>
        <label>conform password</label><g:textField name="conformPassword"></g:textField>
           <g:submitButton name="submit" value="save"/>
       </g:form>
</body>
</html>