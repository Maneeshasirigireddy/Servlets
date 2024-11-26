package com.ser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Submit")
public class httpSession2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int i=Integer.parseInt(req.getParameter("id"));
		String n=req.getParameter("name");
		int a=Integer.parseInt(req.getParameter("age"));
		
		HttpSession session=req.getSession();
		Student stu=new Student(i,n,a);
		
		session.setAttribute("myStudent", stu);
		
		System.out.println("Session Created");
		
		Student s1=(Student) session.getAttribute("myStudent");
		
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
		
	}
	
	

}
