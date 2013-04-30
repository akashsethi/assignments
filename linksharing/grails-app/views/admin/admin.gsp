<html>
<head>
    <meta name="layout" content="main">
</head>
<body>
     <h1>${session.user}</h1>
<g:link controller="user" action="logout"  >Logout</g:link>
<g:link controller="admin " action="stats"  >User Details</g:link>
</body>
</html>