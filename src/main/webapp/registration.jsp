<html>
<head>
    <title>Registration</title>

</head>
<body>
<article>
    <div align="center">
        <h1>
            Registration <br/>
        </h1>

        <form method="get" action="${pageContext.request.contextPath}/registration">
            <p><b>Login</b><br>
                <input type="text" size="40">
            </p>

            <p><b>Password</b><br>
                <input type="password" size="40">
            </p>

            <p><b>Name</b><br>
                <input type="text" size="40">
            </p>

            <p><b>Surname</b><br>
                <input type="text" size="40">
            </p>

            <p><b>E-mail</b><br>
                <input type="text" size="40">
            </p>

            <input class="button" type="submit" value="Submit">
        </form>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">To the main</a>

    </div>
</article>
</body>
</html>