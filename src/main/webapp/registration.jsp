<html>
<head>
    <title>Registration</title>

    <%--<style>--%>
        <%--section{--%>
            <%--text-align: center;--%>
            <%--text-indent: 30%;--%>
            <%--background-color: #B9AC8E;--%>
        <%--}--%>
    <%--</style>--%>

</head>

<body>
<section>
        <h1>
            Registration <br/>
        </h1>

    <%--TODO for each form item to make label, i18n, placeholders, sizes of fields--%>
    <%--Todo include stylesheets--%>
    <%--TODO role as radio--%>

        <div class="reg">
            <form method="post" action="${pageContext.request.contextPath}/registration">

                <p><b>Login</b><br>
                    <input type="text" size="40" name="login" id="login">
                </p>

                <p><b>Role</b><br>
                    <input type="text" size="40" name="role" id="role">
                </p>

                <p><b>Ukrainian name</b><br>
                    <input type="text" size="40" name="nameUa" id="nameUa">
                </p>

                <p><b>Ukrainian surname</b><br>
                    <input type="text" size="40" name="surNameUa" id="surNameUa">
                </p>

                <p><b>English name</b><br>
                    <input type="text" size="40" name="nameEng" id="nameEng">
                </p>

                <p><b>English surname</b><br>
                    <input type="text" size="40" name="surNameEng" id = "surNameEng">
                </p>

                <p><b>Email</b><br>
                    <input type="email" size="40" name="email" id = "email">
                </p>

                <p><b>Password</b><br>
                    <input type="password" size="40" name="password" id = "password">
                </p>

                <input class="button" type="submit" value="Submit">
            </form>
        </div>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">To the main</a>

</section>
</body>
</html>