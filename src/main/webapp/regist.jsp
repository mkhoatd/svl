<%--
  Created by IntelliJ IDEA.
  User: mkhoatd
  Date: 12/1/2022
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="css/login.css">

</head>
<body>
  <main class="main">
    <div class="container">
      <section class="wrapper">
        <div class="heading">
          <h1 class="text text-large">Sign Up</h1>
        </div>
        <form name="signin" class="form" method="post" action="RegistServlet">
          <div class="input-control">
            <label for="username" class="input-label" hidden>Email Address</label>
            <input type="text" name="username" id="username" class="input-field" placeholder="Username">
          </div>
          <div class="input-control">
            <label for="password" class="input-label" hidden>Password</label>
            <input type="text" name="password" id="password" class="input-field" placeholder="Password">
          </div>
          <div class="input-control">
            <input type="submit" name="submit" class="input-submit" value="Sign Up" >
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
