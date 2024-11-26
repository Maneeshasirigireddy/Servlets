package com.ser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class cookiees extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Cookie c1=new Cookie("username","Mani");
		Cookie c2=new Cookie("password","mani@333");
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		System.out.println("Cookies created");
	}
}
