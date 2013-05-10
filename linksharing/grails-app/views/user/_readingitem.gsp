<html>
<head>
    <meta name="layout" content="main">
</head>
<body>

       <div>the reading item:</div>

       <g:each in="${readingitem}" var="i">
           <p>
           <g:checkBox name="check" value="${false}"></g:checkBox>
            <g:if test="${i.isRead=="Yes"}">
                ${i}
            </g:if>
               <g:else>
                   ${i}
               </g:else>
           </p>
       </g:each>
      <!--  <g:formatDate> date="${new java.util.Date()}" format="mm-dd-yyyy">${date}</g:formatDate>    -->
        <ls:dateFormat value="${new Date()}" />
</body>
</html>