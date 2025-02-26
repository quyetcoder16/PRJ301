<%-- 
    Document   : list
    Created on : Feb 17, 2025, 6:23:11 AM
    Author     : quyet
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <canvas id="myCanvas" width="500" height="500" style="border:1px solid grey"></canvas>
        <script>
            const c = document.getElementById("myCanvas");
            const ctx = c.getContext("2d");
            <c:forEach items="${requestScope.rects}" var="r" varStatus="loop">
                <c:if test="${loop.index % 2==0}">
                    <c:if test="${r.x >=200}">
            ctx.fillStyle = "red";
            ctx.fillRect(${r.x}, ${r.y}, ${r.w}, ${r.h});
                    </c:if>
            ctx.beginPath();
            ctx.rect(${r.x}, ${r.y}, ${r.w}, ${r.h});
            ctx.stroke();
                </c:if>

            </c:forEach>
        </script>
    </body>
</html>
