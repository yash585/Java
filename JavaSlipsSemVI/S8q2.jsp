<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prime</title>
</head>
<body>
<form method="POST" action="S8q2.jsp">
	<input type="text" name="t1">
	<input type="submit">
</form>
<%
	String s=request.getParameter("t1");
	int i;
	if(s!=null)
	{
		int n=Integer.parseInt(s);
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			out.print("Prime");
		}
		else
		{
			out.print("not prime");
		}
	}
	
%>

</body>
</html>