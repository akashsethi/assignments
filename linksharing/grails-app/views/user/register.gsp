<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 9/5/13
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
  <title>registration</title>
</head>
<body>
<g:hasErrors bean="${user}">
    <ul>
        <g:eachError var="err" bean="${user}">
            <li><g:message error="${err}" /></li>
        </g:eachError>
    </ul>
</g:hasErrors>
${flash.message}
 <g:form name="register" action="registration">
   <div style="width: 200px">
     <div>  <label>Email</label><g:textField name="email"></g:textField> </div>
       <div><label>Password</label><g:passwordField name="password"/></div>
       <div><label>Conform Password</label><g:passwordField name="conformPassword"/></div>
       <div><label>FirstName</label><g:textField name="firstName"/></div>
       <div><label>LastName</label><g:textField name="lastName"/></div>
       <div><label>Gender</label><g:select name="gender" from="['male','female']"/></div>
      <div style="float:left;width: 500px"> <label>DateOfBirth</label><g:datePicker name="dateOfBirth" precision="day"
            noSelection="['':'choose']"/> </div>
       <div><g:submitButton name="save" value="Save"/> </div>

   </div>
 </g:form>
</body>
</html>