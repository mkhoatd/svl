<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/index.css">
    <script src="js/index.js"></script>
</head>
<body>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <nav id="navbar" class="">
        <div class="nav-wrapper">
            <!-- Navbar Logo -->
            <div class="logo">
                <!-- Logo Placeholder for Inlustration -->
                <a href="#home"><i class="fa fa-angellist"></i> </a>
            </div>

            <!-- Navbar Links -->
            <ul id="menu">
                <li><a href="login.jsp">Login</a></li><!--
       --><li><a href="regist.jsp">Register</a></li><!--
       --><li><a href="#about">About</a></li><!--
       --><li><a href="#contact">Contact</a></li>
            </ul>
        </div>
    </nav>


    <!-- Menu Icon -->
    <div class="menuIcon">
        <span class="icon icon-bars"></span>
        <span class="icon icon-bars overlay"></span>
    </div>


    <div class="overlay-menu">
        <ul id="menu">
            <li><a href="login.jsp">Login</a></li>
            <li><a href="regist.jsp">Register</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
        </ul>
    </div>
</body>
</html>