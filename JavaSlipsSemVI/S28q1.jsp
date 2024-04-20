<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="S28q1.jsp">
	Enter String
	<input type="text" name="t1">
	<input type="submit">
	</form>
<%
	String s=request.getParameter("t1");
	if(s!=null)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		out.println(sb);
	}
%>
	
</body>
</html>
