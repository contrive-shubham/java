<html>
<body>
<%
String user=request.getParameter("txtuser");
String pass=request.getParameter("txtpass");
if (user.equals("mahak") && pass.equals("mahak"))
{
out.println("welcome page"+user);
}
else
{
out.println("user name and password does not match");
}
%>
</body>
</html>