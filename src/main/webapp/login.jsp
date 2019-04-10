<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<c:set var="language" value="${not empty sessionScope.language ? sessionScope.language : pageContext.request.locale}" scope="session" />--%>
<%--<fmt:setLocale value="${""}"/>--%>

<%--<html>--%>
<%--<head>--%>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <%--<title>Login Page</title>--%>
<%--</head>--%>
<%--<body>--%>
    <%--<div align="center">--%>

        <%--<h1>Log in</h1><br/>--%>

        <%--<form method="get" action="${pageContext.request.contextPath}/login">--%>

            <%--<p><b>Login</b><br>--%>
                <%--<input type="text" size="40">--%>
            <%--</p>--%>

            <%--<p><b>Password</b><br>--%>
                <%--<input type="password" size="40">--%>
            <%--</p>--%>

            <%--<input class="button" type="submit" value="Submit">--%>
        <%--</form>--%>
        <%--<br/>--%>

        <%--<a href="${pageContext.request.contextPath}/logout">To the main</a>--%>

    <%--</div>>--%>

<%--</body>--%>
<%--</html>--%>


<!doctype html>
<html lang="ua">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <fmt:setLocale value="ua_UA" scope="session"/>
    <fmt:setBundle basename="messages"/>

    <title><fmt:message key="message.login.title"/> </title>

    <%--<link rel="canonical" href="css">--%>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>

    <!-- Custom styles for this template -->
    <style>
    <%@include file='resources/css/signin.css' %>
    </style>

</head>
<body class="text-center">
<form class="form-signin">
    <jsp:text>${pageContext.request.contextPath} </jsp:text>
    <h1 class="h3 mb-3 font-weight-normal"><fmt:message key="message.login.request"/></h1>
    <label for="inputEmail" class="sr-only"><fmt:message key="message.login.login"/></label>
    <input type="login" id="inputEmail" class="form-control" placeholder=<fmt:message key="message.login.login"/> required autofocus>
    <label for="inputPassword" class="sr-only"><fmt:message key="message.login.password"/></label>
    <input type="password" id="inputPassword" class="form-control" placeholder=<fmt:message key="message.login.password"/> required>
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> <fmt:message key ="message.login.remember"/>
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit"><fmt:message key="message.login.title"/></button>
    <p class="mt-5 mb-3 text-muted"></p>
</form>
</body>
</html>