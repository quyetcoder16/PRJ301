<%-- 
    Document   : list
    Created on : Feb 10, 2025, 5:45:28 AM
    Author     : quyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="model.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .dataRow
            {
                background-color: gray;
            }

        </style>
        <%
            ArrayList<Student> listStudent = (ArrayList<Student>) request.getAttribute("data");
        %>
    </head>
    <body>
        <table border=\"1px\">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Dob</th>
                <th>Gender</th>
            </tr>
            <%for(Student s :listStudent){%>
            <tr class="dataRow">
                <td><%=s.getStudentId()%></td>
                <td><%=s.getStudentName()%></td>
                <td><%=s.getDob()%></td>
                <td><%=(s.isGender() ? "Male" : "Female")%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
