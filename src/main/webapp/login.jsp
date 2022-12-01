<%--
  Created by IntelliJ IDEA.
  User: mkhoatd
  Date: 11/30/2022
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<main class="main">
    <div class="container">
        <section class="wrapper">
            <div class="heading">
                <h1 class="text text-large">Sign In</h1>
                <p class="text text-normal">New user? <span><a href="regist.jsp" class="text text-links">Create an account</a></span>
                </p>
            </div>
            <form name="signin" class="form" method="post" action="CheckLoginServlet">
                <div class="input-control">
                    <label for="username" class="input-label" hidden>Email Address</label>
                    <input type="text" name="username" id="username" class="input-field" placeholder="Username">
                </div>
                <div class="input-control">
                    <label for="password" class="input-label" hidden>Password</label>
                    <input type="password" name="password" id="password" class="input-field" placeholder="Password">
                </div>
                <div class="input-control">
                    <input type="submit" name="submit" class="input-submit" value="Sign In" >
                </div>
            </form>
            <div class="striped">
                <span class="striped-line"></span>
                <span class="striped-line"></span>
            </div>
        </section>
    </div>
</main>
</body>
</html>
