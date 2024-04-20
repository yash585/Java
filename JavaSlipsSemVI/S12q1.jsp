<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="POST" action="S12q1.jsp">
	Enter no:<input type="number" name="t1"><br>
	<input type="submit">

</form>
<%
	int sum=0;
	String n=request.getParameter("t1");
	if(n!=null)
	{
		 int a=Integer.parseInt(n);
		 for(int i=1;i<a;i++)
		 {
			 if(a%i==0)
			 {
				 sum+=i;
			 }
		 }
		 if(sum==a)
			 out.println("Perfect");
		 else
			 out.println("Not Perfect");
		
	}

%>
</body>
</html>