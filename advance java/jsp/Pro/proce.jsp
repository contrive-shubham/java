<html>
<body>
<%@ page import="java.sql.*" %>
<% try
{
Class.forName("oracle.jdbc.driver.oracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","system","12345");
Statement s=c.createStatement();
CallableStatemnet cs=c.prepareCall("{call recinus2(?,?)}");
cs.setString(1,"java");
cs.setInt(2,10);
cs.executeUpdate();
ResultSet rs=s.executeQuery("select * from emp1");
while(re.next())
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