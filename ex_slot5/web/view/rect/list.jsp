<%-- 
    Document   : list
    Created on : Feb 10, 2025, 6:08:46 AM
    Author     : quyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="model.Rect" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Rect> rects = (ArrayList<Rect>)request.getAttribute("rects");
        %>
    </head>
    <body>
        <canvas id="myCanvas" width="500" height="500" style="border:1px solid grey"></canvas>
        <script>
            const c = document.getElementById("myCanvas");
            const ctx = c.getContext("2d");
            <%for(Rect r : rects){%>
            ctx.beginPath();
            ctx.rect(<%=r.getX()%>, <%=r.getY()%>, <%=r.getW()%>, <%=r.getH()%>);
            ctx.stroke();
            <%}%>
        </script>
    </body>
</html>
