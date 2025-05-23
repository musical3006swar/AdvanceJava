<%@ page import="javax.servlet.http.Cookie" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie Set</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    String maxAgeStr = request.getParameter("maxAge");

    int maxAge = 0;
    try {
        maxAge = Integer.parseInt(maxAgeStr);
    } catch (NumberFormatException e) {
        out.println("<p>Invalid Max Age value!</p>");
    }

    if(name != null && !name.isEmpty()) {
        Cookie cookie = new Cookie(name, "Cookie_" + name);  // Example value
        cookie.setMaxAge(maxAge);
        if(domain != null && !domain.isEmpty()) {
            cookie.setDomain(domain);
        }
        response.addCookie(cookie);
%>
    <h2>Cookie has been set!</h2>
    <p><strong>Name:</strong> <%= cookie.getName() %></p>
    <p><strong>Value:</strong> <%= cookie.getValue() %></p>
    <p><strong>Domain:</strong> <%= (domain == null || domain.isEmpty()) ? "Not Set" : domain %></p>
    <p><strong>Max Age:</strong> <%= maxAge %> seconds</p>
    <br/>
    <a href="showcookies.jsp">Go to Active Cookie List</a>
<%
    } else {
        out.println("<p>Please provide a valid cookie name.</p>");
    }
%>
</body>
</html>
