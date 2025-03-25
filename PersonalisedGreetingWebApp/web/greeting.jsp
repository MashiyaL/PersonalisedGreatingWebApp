<%-- 
    Document   : greeting
    Created on : 08 Feb 2025, 6:10:56 AM
    Author     : Gift Mashiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting Page</title>
    </head>
    <body>
        <h1>Greetings!</h1>
        <%
           String greeting = (String)request.getAttribute("greeting");
        %>
        <p>
            <%=greeting%>  
        </p>
        <p>
            Click <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
