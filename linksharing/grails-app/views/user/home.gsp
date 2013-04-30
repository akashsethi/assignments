<html>
<head>
    <meta content="main" name="layout">
    <title>home</title>
</head>
<body>
welcome  ${session.user}
<g:link controller='user' action="logout" >Logout</g:link>
<g:link controller='user' action="readingitem" >Reading Item</g:link>
<p>Topic : ${c1.name}</p>
<p>Subscribed : ${c2.topic}</p>
</body>
</html>