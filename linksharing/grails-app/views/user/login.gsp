<html>
<head>
    <meta name="layout" content="main">
    <title>

    </title>
    <style>
    label{float:left;width:50px}
    </style>
</head>
<body>
${flash.message}
<g:form action="loginHandler" >
    <div style="width:200px">
        <label>Name:</label><input type="text" name="username"/>
        <label>Password:</label><input type="password" name="password"/>
        <label></label><input type="submit" name="login"/>

    </div>
</g:form>
</body>
</html>