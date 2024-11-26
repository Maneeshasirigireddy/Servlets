package com.ser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/hey")
public class httpSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String user =req.getParameter("user");
		String pass=req.getParameter("password");
		HttpSession s=req.getSession();
		
		s.setAttribute("username", user);
		s.setAttribute("password", pass);
		
		System.out.println("Http Session Management Created");
		String s1=(String) s.getAttribute("username");
		String s2=(String) s.getAttribute("password");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
		
	}
	
	

}
