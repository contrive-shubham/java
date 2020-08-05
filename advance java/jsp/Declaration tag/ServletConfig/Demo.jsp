<html>
<body>
<%! String s;
public void jspInit()
{
ServletConfig config=getServletConfig();
s=config.getInitParameter("name");
}
%>
<%
String s1=config.getInitParameter("name");
out.println(s+s1);
%>
</body>
</html>
