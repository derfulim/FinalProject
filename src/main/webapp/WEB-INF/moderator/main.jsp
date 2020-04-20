<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Moderators main page</title>
</head>
<body>


    <section>
        <table class="rating table">
            <caption>Speakers' ratings</caption>
            <thead>
            <tr>
                <th>Speakers name</th>
                <th>Speakers rating</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="speaker" items="${speakers}">
                <tr>
                    <td>${speaker.nameEng} ${speaker.surnameEng}</td>
                    <td>${speaker.rating}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </section>

    <div>
            <table class="table">
                <caption>Conference schedule</caption>
                <thead>
                <tr>
                    <th>Conference</th>
                    <th>Date</th>
                    <th>Place</th>
<%--                    <th>Lectures list</th>--%>
                    <th>Number of sits</th>
                    <th>Registered participants</th>
                    <th>Lectures list</th>
<%--                    <th>Number of visitors</th>--%>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="event" items="${events}">
                    <tr>
                        <td>${event.nameEng}</td>
                        <td>${event.date}</td>
                        <td>${event.placeEng}</td>
<%--                        <td>${event.lectures}</td>--%>
                        <td>${event.sits}</td>
                        <td>${event.participants.size()}</td>
                        <td>
                            <details>
                                <table class="table">
<%--                                        <caption>List of lecture of conference ${conference.name}</caption>--%>
                                        <thead>
                                        <tr>
                                            <th>Lectures title</th>
                                            <th>Speakers name</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="lecture" items="${event.lectures}">
                                            <tr>
                                                <td>${lecture.nameEng}</td>
                                                <td>${lecture.speaker.nameEng} ${lecture.speaker.surnameEng}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                <summary>Show lectures list</summary>
                            </details>
<%--                                ${event.participants.size()}--%>
                        </td>
<%--                        <td>${event.visitors}</td>--%>
<%--                        <td><a href="${pageContext.request.contextPath}/editconference.jsp">Edit</a><br></td>--%>
<%--                        <td><a href="${pageContext.request.contextPath}/lectures_list.jsp">Show lectures list</a><br></td>--%>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
</body>
</html>

<%--<!DOCTYPE html>--%>
<%--<html lang="en-US">--%>
<%--  <head>--%>
<%--  <link href="payment-form.css" rel="stylesheet">--%>
<%--    <meta charset="utf-8">--%>
<%--    <title>My test page</title>--%>
<%--  </head>--%>
<%--  <body>--%>
<%--    <p>This is my page</p>--%>
<%--    --%>
<%--    <form>--%>
<%--    <h1>Payment form</h1>--%>
<%--    <p>Required fields are followed by <strong><abbr title="required">*</abbr></strong>.</p>--%>
<%--    <section>--%>
<%--    <h2>Contact information</h2>	--%>
<%--    <fieldset>--%>
<%--    <legend>Title</legend>--%>
<%--    <ul>--%>
<%--    <li>--%>
<%--    <label for="title_1">--%>
<%--    <input type="radio" id="title_1" name="title" value="K" >--%>
<%--    King--%>
<%--    </label>--%>
<%--    </li>--%>
<%--    <li>--%>
<%--    <label for="title_2">--%>
<%--    <input type="radio" id="title_2" name="title" value="Q">--%>
<%--    Queen--%>
<%--    </label>--%>
<%--    </li>--%>
<%--    <li> --%>
<%--    <label for="title_3"> --%>
<%--    <input type="radio" id="title_3" name="title" value="J">--%>
<%--    Joker --%>
<%--    </label> --%>
<%--    </li>--%>
<%--    </ul>--%>
<%--    </fieldset>--%>
<%--    <p>--%>
<%--    <label for="name">--%>
<%--    <span>Name: </span>--%>
<%--    <strong><abbr title="required">*</abbr></strong>--%>
<%--    </label>--%>
<%--    <input type="text" id="name" name="username">--%>
<%--    </p>--%>
<%--    <p>--%>
<%--    <label for="mail">--%>
<%--    <span>E-mail: </span>--%>
<%--    <strong><abbr title="required">*</abbr></strong>--%>
<%--    </label>--%>
<%--    <input type="email" id="mail" name="usermail">--%>
<%--    </p>--%>
<%--    <p>--%>
<%--    <label for="pwd">--%>
<%--    <span>Password: </span>--%>
<%--    <strong><abbr title="required">*</abbr></strong>--%>
<%--    </label>--%>
<%--    <input type="password" id="pwd" name="password">--%>
<%--    </p>--%>
<%--    </section>--%>
<%--    <section>--%>
<%--    <h2>Payment information</h2>--%>
<%--    <p>--%>
<%--    <label for="card">--%>
<%--    <span>Card type:</span>--%>
<%--    </label>--%>
<%--    <select id="card" name="usercard">--%>
<%--    <option value="visa">Visa</option>--%>
<%--    <option value="mc">Mastercard</option>--%>
<%--    <option value="amex">American Express</option>--%>
<%--    </select>--%>
<%--    </p>--%>
<%--    <p>--%>
<%--    <label for="number">--%>
<%--    <span>Card number:</span>--%>
<%--    <strong><abbr title="required">*</abbr></strong>--%>
<%--    </label>--%>
<%--    <input type="tel" id="number" name="cardnumber">--%>
<%--    </p>--%>
<%--    <p>--%>
<%--    <label for="date">--%>
<%--    <span>Expiration date:</span>--%>
<%--    <strong><abbr title="required">*</abbr></strong>--%>
<%--    <em>formatted as mm/dd/yyyy</em>--%>
<%--    </label>--%>
<%--    <input type="date" id="date" name="expiration">--%>
<%--    </p>--%>
<%--    </section>--%>
<%--    <p> <button type="submit">Validate the payment</button> </p>--%>
<%--    </form>--%>
<%--    --%>
<%--  </body>--%>
<%--</html>--%>
