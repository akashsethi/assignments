<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 16/5/13
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout"/>
  <title></title>
</head>
<body>
<div style="padding: 10px">
       ${topicId.name}
       <g:link controller="documentResource" action="upload" params="[topicId:topicId.name]">upload a document</g:link>
</div>
<div>
    <h3>Link Resource</h3>
    <ul>
        <g:each in="${links}" var="lnk">
           <li><a href="${createLink(url: lnk.resources.url)}">${lnk.resources.title}</a> </li>
        </g:each>
    </ul>
</div>
<div>
    <h3>Document Resources</h3>
     <g:each in="${document}" var="doc">
         <li> ${doc.title}</li>
     </g:each>

</div>

</body>
</html>