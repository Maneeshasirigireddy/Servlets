package com.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet{

	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email-id");
		String age=req.getParameter("age");
		String mobile=req.getParameter("mobile");
		PrintWriter p=resp.getWriter();
		p.print("<h1>"+name+"</h1>");
		p.print("<h1>"+email+"</h1>");
		p.print("<h1>"+age+"</h1>");
		p.print("<h1>"+mobile+"</h1>");
		
		//System.out.println(name+" , "+email+" ,"+age+" ,"+mobile);
	}	
}
