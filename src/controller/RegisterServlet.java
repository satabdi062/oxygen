package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Patient;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String contact=req.getParameter("contact");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Patient p=new Patient();
		p.setName(name);
		p.setAddress(address);
		p.setContact(contact);
		p.setEmail(email);
		p.setPassword(password);
		try {
			int row=p.addPatient();
			
			if(row==1)
			{
				RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
				req.setAttribute("msg", "Registration Successfull");
				rd.forward(req, resp);
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
				req.setAttribute("msg", "Failed");
				rd.forward(req, resp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
