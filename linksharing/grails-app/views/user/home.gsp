<html>
<head>
    <meta content="main" name="layout">
    <title>home</title>
</head>
<body>
welcome  ${session.user}
<g:link controller='user' action="logout" >Logout</g:link>
<g:link controller='user' action="readingitem" >Reading Item</g:link>
<div>
<ul>Owned Topic :
<ls:ownedTopic listTopic="${ownedtopic}" >

        <g:each in="${val}" var="n">
                <li style="margin-left: 20px">${n.name}</li>
        </g:each>

</ls:ownedTopic>
</ul>
</div>

<ul>
Subscribed topic:
<ls:subscribedTopics subs="${c2}"><li style="margin-left:20px">${i.topic}</li></ls:subscribedTopics>
</ul>



</body>
</html>