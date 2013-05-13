<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 13/5/13
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
</head>
<body>
<ul>

   <g:each in="${user}" var="i">
       <li>
       ${i.resources.url}
       </li>
   </g:each>
</ul>
</body>
</html>