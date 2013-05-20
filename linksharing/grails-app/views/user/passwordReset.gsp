<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 14/5/13
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
   <meta content="main" name="layout"/>
</head>
<body>
    ${flash.message}
    <g:form action="passwordReset">
      enter email  <g:textField name="email"></g:textField>
       <g:submitButton name="submit" value="ok"/>
    </g:form>
</body>
</html>