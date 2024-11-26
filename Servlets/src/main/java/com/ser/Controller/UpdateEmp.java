package com.ser.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ser.Entity.Employee;
import com.ser.Service.EmpSevice;

@WebServlet("/update")
public class UpdateEmp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee emp = new Employee(id, name, age, email, salary);
        EmpSevice eService = new EmpSevice();
        int result = eService.updateEmp(emp);

        resp.setContentType("text/html");
        if (result > 0) {
        	RequestDispatcher d=req.getRequestDispatcher("Welcome1.html");
			d.include(req,resp);
        } else {
            resp.getWriter().println("Failed to update employee.");
        }
    }
}
