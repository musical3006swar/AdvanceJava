<%-- Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then
it has to go to show the active cookie list when you press the link go to the active cookie list --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie Management</title>
</head>
<body>
    <h2>Set a Cookie</h2>
    <form action="setcookie.jsp" method="post">
        <label>Name:</label><br/>
        <input type="text" name="name" required/><br/><br/>
        
        <label>Domain:</label><br/>
        <input type="text" name="domain"/><br/><br/>
        
        <label>Max Age (in seconds):</label><br/>
        <input type="number" name="maxAge" required/><br/><br/>
        
        <input type="submit" value="Add Cookie"/>
    </form>
</body>
</html>
