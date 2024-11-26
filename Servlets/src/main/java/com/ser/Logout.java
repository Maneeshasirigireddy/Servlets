package com.ser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/home")
public class Logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sesson=req.getSession();
		
		String name=(String) sesson.getAttribute("username");
		if(name.equals("Maneesha")) {
			sesson.invalidate();
			System.out.println("Deleted");
			
			resp.sendRedirect("Login1.html");
			
		}
		
		
		
		
	}

	
}
