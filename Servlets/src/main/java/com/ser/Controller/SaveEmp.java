package com.ser.Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ser.Entity.Employee;
import com.ser.Service.EmpSevice;
@WebServlet("/register")
public class SaveEmp extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String i=req.getParameter("id");
		String name=req.getParameter("name");
		String a=req.getParameter("age");
		String email=req.getParameter("email");
		String salary=req.getParameter("salary");
		
		int id=Integer.parseInt(i);
		int age=Integer.parseInt(a);
		double sal=Double.parseDouble(salary);
		
		Employee e=new Employee(id,name,age,email,sal);
		
		EmpSevice e1=new EmpSevice();
		int no=e1.saveEmp(e);
		if(no!=0){
		RequestDispatcher d=req.getRequestDispatcher("Welcome1.html");
			d.include(req,resp);
		}
		else {
			PrintWriter p=resp.getWriter();
			p.write("<h1>Data is not saved</h1>");
		}
		
		
		
	}

}
