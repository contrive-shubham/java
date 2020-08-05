<html>  
<body>  
<%  
String name=request.getParameter("name");
String pass=request.getParameter("pass"); 
RequestDispatcher rd=request.getRequestDispatcher("Demo.jsp");
rd.include(request,response);
//rd.forward(request,response);
if(name.equals("Ducat") && pass.equals("noida"))
out.println("valid");
else
out.println("Invalid");  
%>  
</body>  
</html>  