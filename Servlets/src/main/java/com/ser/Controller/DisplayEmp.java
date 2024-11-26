package com.ser.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ser.Entity.Employee;
import com.ser.Service.EmpSevice;

@WebServlet("/display")
public class DisplayEmp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmpSevice e = new EmpSevice();
        List<Employee> l = e.getAll();

        resp.setContentType("text/html");
        PrintWriter p = resp.getWriter();
        
        p.print("<table border='1'>");
        p.print("<thead>");
        p.print("<tr>");
        p.print("<th>Id</th>");
        p.print("<th>Name</th>");
        p.print("<th>Age</th>");
        p.print("<th>Email</th>");
        p.print("<th>Salary</th>");
        p.print("<th>Actions</th>");
        p.print("</tr>");
        p.print("</thead>");
        p.print("<tbody>");
        
        for (Employee d : l) {
            int id = d.getId();
            String name = d.getName();
            int age = d.getAge();
            String email = d.getEmail();
            double salary = d.getSalary();
            
            p.print("<tr>");
            p.print("<td>" + id + "</td>");
            p.print("<td>" + name + "</td>");
            p.print("<td>" + age + "</td>");
            p.print("<td>" + email + "</td>");
            p.print("<td>" + salary + "</td>");
            p.print("<td>");
            p.print("<a href='Update1.html?id=" + id + "'>edit</a> ");
            p.print("<a href='Delete1.html?id=" + id + "'>delete</a>");
            p.print("</td>");
            p.print("</tr>");
        }
        
        p.print("</tbody>");
        p.print("</table>");
    }
}
