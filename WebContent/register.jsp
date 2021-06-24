<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/mystyle.css">
</head>
<body background="oxy2.jpg">
<form class="register-form" action="register" method="post">
<p>
<div>
<input type="text" name="name" placeholder="Enter your name">
</div></p>
<p>
<p>
<div>
<input type="text" name="address" placeholder="Enter your address">
</div></p>
<p>
<p>
<div>
<input type="text" name="contact" placeholder="Enter contact no">
</div></p>
<p>
<p>
<div>
<input type="text" name="email" placeholder="Enter email_id">
</div></p>
<p>
<div>
<input type="password" name="password" placeholder="Enter password">
</div></P>
<div>
<input class="button" type="submit" name="Register" value="Register">
</div>
<p>
<div>
<a class="button" type="submit" href="home.jsp">Skip</a>
</div></p>
<p>${requestScope['msg']}</p>
</form>
</body>
</html>