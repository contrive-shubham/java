<html>
<body>
<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");
RequestDispatcher rd=request.getRequestDispatcher("Demo.jsp");
rd.forward(request,response);
//rd.include(request,response);
if(name.equals("ducat") && pass.equals("noida"))
out.println("valid");
else
out.println("invalid");
%>
</body>
</html>