<%@ page errorPage="error.jsp" %>
<html>
<body>
<center> welcome</center>
<%
String num1=request.getParameter("n1");
String num2=request.getParameter("n2");

int a=Integer.parseInt(num1);
int b=Integer.parseInt(num2);
int c=a/b;
out.println("division of numbers is:"+c);
%>

</body>
</html>