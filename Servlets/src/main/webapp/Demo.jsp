<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList" %>
<%@ include file="student.html" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int add(){
	int a=2;
	int b=5;
	int c=a+b;
	return c;
}
%>

<%! double mul(int a,int b){
	return a*b;
}
%>

<%!
String display(){
	ArrayList a=new ArrayList();
	a.add(4);
	a.add(5);
	a.add(6);
	
	return a.toString();
}
%>
<h1>the result <%=add() %></h1>
<h1>Multiplication: <%=mul(10,5) %></h1>
<h1>Display : <%=display() %></h1>
</body>
</html>