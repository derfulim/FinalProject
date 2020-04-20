
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit conference</title>

    <section>
            <h1>
                Conference edition <br/>
            </h1>

        <%--TODO for each form item to make label, i18n, placeholders, sizes of fields--%>
        <%--Todo include stylesheets--%>
        <%--TODO role as radio--%>

            <div class="edconf">
                <form method="post" action="${pageContext.request.contextPath}/editconference">

                    <p><b>Conference title: </b><br>

                        <input type="text" placeholder="Enter new conference title" size="40" name="title" id="title">
                    </p>

                    <p><b>Location: </b><br>
                        <input type="text" placeholder="Enter new conference location" size="40" name="location" id="location">
                    </p>

                    <p><b>Date: </b><br>
                        <input type="date" placeholder="Enter new conference date" name="date" id="date">
                    </p>

                    <p><b>Number of sits: </b><br>
                        <input type="number" placeholder="Enter new number of sits" size="4" name="sits" id="sits">
                    </p>

                    <p><b>Number of visitor: </b><br>
                        <input type="number" placeholder="Enter new number of visitor" size="4" name="visitors" id="visitors">
                    </p>

                    <p><b>List of lectures: </b><br>
                        Edit lectures list
                    </p>

                    <input class="button" type="submit" value="Submit">
                </form>
            </div>
            <br/>
            <a href="${pageContext.request.contextPath}/index.jsp">To the main</a>

    </section>


</head>
<body>

</body>
</html>
