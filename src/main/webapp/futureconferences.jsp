<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 31.03.2019
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Future conferences</title>
</head>
<br>
    <h1>Future coferences</h1><hr>
    <br>
<div>
    <pre>
Name of the coference
Number of registered participants
Number of seats
Date
Place
List of Lectures - Speaker
<a href="${pageContext.request.contextPath}/registration">Join</a><br>

<%--if number of participants  number of seats and user is not registered go to registration then add user to participants--%>
        <%--if user registered and number of participants < number of seats and user isn't registered to this conference - add to participants--%>
    </pre>
</div>

<a href="${pageContext.request.contextPath}/logout"> To the main</a>


</body>
</html>
