package com.ser;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Logi")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String user=req.getParameter("username");
		if(user.equals("Maneesha")) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Welcome.html");
			dispatcher.forward(req, resp);
		}
		else {
			PrintWriter p=resp.getWriter();
			p.print("<h1 color=red>Invalid UserName</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);

			
		}
		System.out.println(user);
	}
	
	
	

}
