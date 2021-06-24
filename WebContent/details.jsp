<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
    	//Need to check session object for checking my email is null or not.
    	HttpSession hs=request.getSession(false);
    	String email=(String)hs.getAttribute("email");		
    	
    	if(email==null)
    	{
    		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
    		rd.forward(request,response);
    	}
    			
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
your details
</body>
</html>