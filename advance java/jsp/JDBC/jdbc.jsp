<html>
<body>
<%@ page import="java.sql.*" %>
<% try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
Statement s=c.createStatement();
ResultSet rs=s.executeQuery("select*from emp1");
while(rs.next())
{
out.println(rs.getString(1));
out.println(rs.getString(2));
out.println("<br>");
}
}
catch(Exception e){}
%>
</body>
</html>