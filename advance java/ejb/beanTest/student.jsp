

<html>
<body>
	<jsp:useBean id="mybean" class="beanpack.StudentBean"  scope="session"/>

	<jsp:setProperty name="mybean" property="*"/>
	
	<%
		if(mybean.register())
			out.println("Student record registered");
		else
			out.println("DB error occured, see the server console");
	%>
	<jsp:include page="index.html"/>
</body>
</html>
	