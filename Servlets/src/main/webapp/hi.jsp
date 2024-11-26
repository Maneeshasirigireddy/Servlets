<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.ser.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Student stu=(Student)request.getAttribute("myStudent");
String pass=request.getParameter("password");
%>
<h1>Student ID :<%=stu.getId() %></h1>
<h1>Student Name :<%=stu.getName() %></h1>
<h1>Student Age :<%=stu.getAge() %></h1>
</body>
</html>