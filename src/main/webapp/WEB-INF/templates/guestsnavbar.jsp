<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.10.2019
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Conference management system</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>

<body>
        <ul>
            <li class="home"> <a href="${pageContext.request.contextPath}/logout">Home</a></li>
            <li>Hello, guest!</li>
            <li> <a href="${pageContext.request.contextPath}/redirect_login"> Login </a></li>
            <li> <a href="${pageContext.request.contextPath}/redirect_registration">Registration</a></li>
            <li>
                <select size="1">
                <option  value="en">English</option>
                <option  value="ua">Українська</option>
               </select>
            </li>
        </ul>

</body>
</html>
