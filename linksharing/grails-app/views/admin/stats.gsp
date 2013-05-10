<html>
<head>
    <meta name="layout" content="main">
</head>
<body>
<g:link controller="user" action="logout">Logout</g:link>
<ul>
<g:each in="${user}" var="i">
    <li>Name of user is <i>${i.firstName.toUpperCase()} </i> their subscriptions are ${i.subscriptions.size()}</li>
</g:each>
</ul>
</body>
</html>