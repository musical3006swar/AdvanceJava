<%@ page import="javax.servlet.http.Cookie" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Active Cookie List</title>
</head>
<body>
    <h2>Active Cookies</h2>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null && cookies.length > 0) {
%>
    <table border="1" cellpadding="10">
        <tr>
            <th>Name</th>
            <th>Value</th>
        </tr>
<%
        for (Cookie cookie : cookies) {
%>
        <tr>
            <td><%= cookie.getName() %></td>
            <td><%= cookie.getValue() %></td>
        </tr>
<%
        }
%>
    </table>
<%
    } else {
%>
    <p>No active cookies found.</p>
<%
    }
%>
<br/>
<a href="index.jsp">Back to Add Cookie</a>
</body>
</html>
