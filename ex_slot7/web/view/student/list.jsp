<%-- 
    Document   : list
    Created on : Feb 17, 2025, 6:00:03 AM
    Author     : quyet
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Student</title>
        <style>
            .dataRow
            {
                background-color: gray;
            }

        </style>
    </head>
    <body>
        <table border="1px">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Dob</th>
                <th>Gender</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="s" varStatus="loop">
                <tr class="dataRow">
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.dob}</td>
                    <td>${s.gender ? "Male" : "Female"}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
