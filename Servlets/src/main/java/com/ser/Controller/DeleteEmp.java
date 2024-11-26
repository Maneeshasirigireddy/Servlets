package com.ser.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ser.Service.EmpSevice;

@WebServlet("/delete")
public class DeleteEmp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        EmpSevice eService = new EmpSevice();
        int result = eService.deleteEmp(id);

        resp.setContentType("text/html");
        if (result > 0) {
        	RequestDispatcher d=req.getRequestDispatcher("Welcome1.html");
			d.include(req,resp);
        } else {
            resp.getWriter().println("Failed to delete employee.");
        }
    }
}
