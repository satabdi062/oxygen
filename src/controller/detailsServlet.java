package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Patient;
/*
 * @WebServlet(urlPatterns = "/details") public class detailsServlet extends
 * HttpServlet {
 * 
 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
 * resp) throws ServletException, IOException { String e=
 * req.getParameter("search"); Patient ptn=new Patient(); ptn.setName(e);
 * Patient p1=null; try { p1=ptn.search(); if (p1!=null) { RequestDispatcher
 * rd=req.getRequestDispatcher("details.jsp"); req.setAttribute("msg",
 * "2354896"); rd.forward(req, resp);
 * 
 * } else { RequestDispatcher rd= req.getRequestDispatcher("home.jsp");
 * req.setAttribute("msg", "not available"); rd.forward(req, resp); }
 * 
 * } catch (Exception e2) { e2.printStackTrace(); } }
 * 
 * }
 */