<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 13/5/13
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout">
  <title></title>
</head>
<body>
<g:hasErrors bean="${er}">
    <ul>
        <g:eachError bean="${er}" var="error">
            <li><g:message error="${error}"/> </li>
        </g:eachError>
    </ul>
</g:hasErrors>
    <div style="width:200px">
     <g:form action="inviteTopic">
         <div><label>email1</label><g:textField name="email1"></g:textField></div>
         <div><label>email2</label> <g:textField name="email2"></g:textField></div>
         <div><label>email3</label> <g:textField name="email3"></g:textField></div>
         <div><label>email4</label> <g:textField name="email4"></g:textField></div>
         <div><label>email5</label>  <g:textField name="email5"></g:textField></div>
         <div><g:submitButton name="save" value="Invite"/>
      </div>
     </g:form>
    </div>
</body>
</html>