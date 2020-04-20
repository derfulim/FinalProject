<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <jsp:include page="WEB-INF/templates/guestsnavbar.jsp"/>
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">--%>
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">--%>

    <style>
        body {
            text-align: center;
            background-color: whitesmoke;
        }

        TABLE {
            text-align: center;
            margin: auto;
            width: 80%; /* Ширина таблицы */
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
        }

        TD, TH {
            padding: 3px; /* Поля вокруг содержимого таблицы */
            border: 1px solid black; /* Параметры рамки */
        }

        TH {
            background: #0093ff; /* Цвет фона */
        }

        .desc {
            text-indent: 20%;
            text-align: left;
        }
    </style>
</head>

<body class="body">

<section>
    <div class="title">
        <h2>Conference management system</h2>
    </div>
    <div>
        <h3>Conference management system helps you to find all significant science and social events in your city, it's
            date and place, and participate it.</h3>
    </div>
    <div>
        <table class="table">
            <caption>Conference schedule</caption>
            <thead>
            <tr>
                <th>Conference</th>
                <th>Date</th>
                <th>Place</th>
                <th>Lectures</th>
                <th>Number of sits</th>
                <th>Registered participants</th>
                <th>Number of visitors</th>
            </tr>
            </thead>

            <tbody>
                <c:forEach var="event" items="${events}">
                    <tr>
                        <td>${event.nameEng}</td>
                        <td>${event.date}</td>
                        <td>${event.placeEng}</td>
                        <td>${event.sits}</td>
                        <td>${event.participants.size()}</td>
                        <td>
                            <details>
                                <table class="table">
                                        <tbody>
                                        <c:forEach var="lecture" items="${event.lectures}">
                                            <tr>
                                                <td>${lecture.nameEng}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                <summary>Lectures list</summary>
                            </details>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
        </table>
    </div>


    <p>This is part for testing transfers to another pages</p>
    <a href="${pageContext.request.contextPath}/moderator_main">To moderators main page</a>
</section>

<%--<a href="${pageContext.request.contextPath}/app/exception">Exception</a>--%>

<footer>
<jsp:include page="WEB-INF/templates/footbar.jsp"/>
</footer>
</body>


</html>
