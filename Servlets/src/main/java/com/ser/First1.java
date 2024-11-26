package com.ser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/index")
public class First1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s=new Student(102,"Maneesha",22);
		req.setAttribute("myStudent", s);
		
		RequestDispatcher r=req.getRequestDispatcher("hi.jsp");
		r.forward(req, resp);
	}

	
}
