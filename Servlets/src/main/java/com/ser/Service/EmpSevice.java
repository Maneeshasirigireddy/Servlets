package com.ser.Service;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ser.Entity.Employee;

public class EmpSevice{
	public static String url="jdbc:postgresql://localhost:5432/empmanagement";
	public static String user="postgres";
	public static String pass="root";
	public static Connection c;
	static{
		try {
			Class.forName("org.postgresql.Driver");
			
			c=DriverManager.getConnection(url, user, pass);
			
		}
		catch(ClassNotFoundException |SQLException e) {
			System.out.println("Error during connection setup: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public int saveEmp(Employee e) {
		int no=0;
		String sql="insert into employee1 values(?,?,?,?,?)";
		try {
			PreparedStatement p=c.prepareStatement(sql);
			p.setInt(1, e.getId());
			p.setString(2, e.getName());
			p.setInt(3, e.getAge());
			p.setString(4,e.getEmail());
			p.setDouble(5, e.getSalary());
			
			no=p.executeUpdate();
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return no;
		
	}
	
	public List<Employee> getAll(){
		
		List<Employee> l1=new ArrayList<Employee>();
		String s="select * from employee1";
		
		ResultSet r;
		try {
			Statement s1=c.createStatement();
			r = s1.executeQuery(s);
			while(r.next()) {
				int i=r.getInt(1);
				String n=r.getString(2);
				int a=r.getInt(3);
				String e=r.getString(4);
				double d=r.getDouble(5);
				l1.add(new Employee(a, e, a, e, d));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l1;
	}
	public int updateEmp(Employee e) { 
		int no = 0; 
		String sql = "UPDATE employee1 SET name=?, age=?, email=?, salary=? WHERE id=?"; 
		try { 
			PreparedStatement p = c.prepareStatement(sql); 
			
			p.setString(1, e.getName());
			p.setInt(2, e.getAge());
			p.setString(3, e.getEmail()); 
			p.setDouble(4, e.getSalary());
			p.setInt(5, e.getId());
			
			no = p.executeUpdate(); 
			
			} catch (SQLException e1) { 
				e1.printStackTrace(); 
			}
			return no; 
		}
	public int deleteEmp(int id) { 
		int no = 0; 
		String sql = "DELETE FROM employee1 WHERE id = ?"; 
		try {
			PreparedStatement p = c.prepareStatement(sql);
			p.setInt(1, id); 
			no = p.executeUpdate(); 
			} catch (SQLException e1) {
				e1.printStackTrace(); 
				} 
		return no; 
	}
}
