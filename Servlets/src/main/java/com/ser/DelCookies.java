package com.ser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class DelCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie [] c=req.getCookies();
		
		if(c!=null) {
			for(Cookie s:c) {
				if(s.getName().equals("username")) {
					s.setMaxAge(0);
					System.out.println("Cookie Deleted");
					
				}
				resp.addCookie(s);
			}
		}
	}
	
	

}
