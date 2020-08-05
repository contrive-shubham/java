import java.sql.*;
import java.io.*;
class Oracle
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
String t1="amit";
int t2=102;
Statement s= c.createStatement();
s.executeUpdate("create table bhart(name varchar(20),salary number)");
s.close();
PreparedStatement ps= c.prepareStatement("insert into bhart value(?,?)");
ps.setString(1,t1);
ps.setInt(2,t2);
ps.executeUpdate();
ps.close();
ps = c.prepareStatement("select  *from bhart  where salary = ?");

ps.setInt(1,t2);
ResultSet  result1=ps.executeQuery();
while (result1.next()){
System.out.println("Name "+result1.getString(1));
System.out.println("salary "+result1.getString(2));
}}
catch(SQLException e)
{
System.out.println(e);
}
catch(Exception  i){System.out.println(i);}

}}


