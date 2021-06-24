<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/mystyle.css">
</head>
<body  background="oxy2.jpg">
<% 	String email="",password="";
			Cookie cookie[]=request.getCookies();
			for(Cookie c:cookie)
			{
				//out.println(c.getName()+" "+c.getValue()+"<br>");
				if(c.getName().equals("email"))
				{
					email=c.getValue();
				}
				if(c.getName().equals("password"))
				{
					password=c.getValue();
				}
			}
%>
<form class="login-form" action="login" method="post">
<p>
<div>
<input type="text" name="email" placeholder="Enter username">
</div></p>
<p>
<div>
<input type="password" name="password" placeholder="Enter password">
</div></P>
<div>
<input class="button" type="submit" name="Login" value="Login">
<a class="button" type="submit" href="register.jsp">Register</a>
</div>
<p>
<div>
<a class="button" type="submit" href="home.jsp">Skip</a>
</div></p>
<div><h1>${requestScope['msg']}</h1></div>
</form>
</body>
</html>