<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/mystyle.css">
</head>
<body><!--  background="oxy2.jpg" -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <!-- <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button> -->

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="about.jsp">About us</a>
      </li>
      <li class="nav-item pr-5">
        <a class="nav-link disabled" href="contact.jsp">Contact</a>
      </li>
      <form action="serach" method="get">
      <li class="nav-item pl-5">
        <input class="form-control mr-sm-5" type="search" name="search" placeholder="Search" aria-label="Search">
         
      <!-- </li>
      <li class="nav-item pl-2"> -->
         <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
      </li></form>
    </ul>
    <form class="form-inline my-2 my-lg-0" action="logout">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</button>
    </form>
  </div>
</nav>
<%-- <center><h2 class="m">${requestScope['msg'] }</h2></center> --%>
<form class="login-form" action="details" method="get">
<h2>${requestScope['msg'] }</h2>
<button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Details</button>
</form>
</body>
</body>
</html>




   