<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty sessionScope.language ? sessionScope.language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="messages"/>

<html>
    <body>

    <header>
        <div align="right">
            <a href="${pageContext.request.contextPath}/login">Login</a>
            <a href="${pageContext.request.contextPath}/registration">Registration</a>
        <form>
            <button>Ukrainian</button>
            <button>English</button>
        </form>
            <h1 align="center">
                Conference management system
            </h1>
        </div>
    </header>





    <aside>
    <br/>
        <a href="${pageContext.request.contextPath}/login">Login</a><br>
    <br/>
        <a href="${pageContext.request.contextPath}/registration">Registration</a><br>
    <br>
    </aside>
        <%--<a href="${pageContext.request.contextPath}/app/exception">Exception</a>--%>

        <div align="center">
        <a href="${pageContext.request.contextPath}/pastconferences">History of events</a> <br>
        <a href="${pageContext.request.contextPath}/futureconferences">Future conferences</a>
        </div>


    </body>
</html>
