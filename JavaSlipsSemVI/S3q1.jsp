<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient</title>
</head>
<body>
<table>
	<%
		try
		{
			Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/exam","postgres","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from patient");
			out.print("<tr><td>pno</td><td>pname</td><td>age</td><td>addr</td>");
			while(rs.next())
			{
				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(3)+"</td></tr>");
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	%>
</table>
</body>
</html>