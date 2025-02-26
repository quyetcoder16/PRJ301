<%-- 
    Document   : welcome
    Created on : Feb 24, 2025, 6:00:13 AM
    Author     : quyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${sessionScope.user.displayname}</h1>
    </body>
</html>
