package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Patient;
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String e= req.getParameter("email");
		String p=req.getParameter("password");
		Patient ptn=new Patient();
		ptn.setEmail(e);
		ptn.setPassword(p);
		Patient p1=null;
		try {
			p1=ptn.login();
			if (p1!=null) {
				HttpSession session=req.getSession();
				session.setAttribute("email",e);
				
				
				//Set email & password in cookie
				Cookie cookie=new Cookie("email",e);
				cookie.setMaxAge(60*60*24);
				resp.addCookie(cookie);
				
				Cookie cookie1=new Cookie("password",p);
				cookie.setMaxAge(60*60*24);
				resp.addCookie(cookie1);
				
				RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
				req.setAttribute("msg", "login successfull");
				rd.forward(req, resp);
				
			} else {
				RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
				req.setAttribute("msg", "login failed");
				rd.forward(req, resp);
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
