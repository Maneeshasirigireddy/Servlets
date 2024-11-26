package com.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login3")
public class Session extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession s=req.getSession();
		String u=req.getParameter("username");
		String p=req.getParameter("password");
		if(u.equals("Maneesha")&&p.equals("Maneesha333")) {
			
			s.setAttribute("username", u);
			s.setAttribute("password", p);
			
			RequestDispatcher r=req.getRequestDispatcher("Home.html");
			r.forward(req, resp);
	
			
			
		}else {
			PrintWriter pr=resp.getWriter();
			pr.print("<h1>Invalid Username & Password");
			RequestDispatcher r=req.getRequestDispatcher("Login1.html");
			r.include(req, resp);
			
		}
		
	}
	
	

}
