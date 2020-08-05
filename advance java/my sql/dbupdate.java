import java.sql.*;
import java.util.*;
import java.io.*;
class dbupdate
{
public static void main(String a[]) throws Exception
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the name of record you want to update");
String name=in.nextLine();
System.out.println("You entered name "+name);
System.out.println("Enter the new salary");
int sal=in.nextInt();
System.out.println("You entered the salary");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
Statement s= c.createStatement();
int x=s.executeUpdate("update record set salary="+sal+"where name='"+name+"'");
if(x==1)
System.out.println("Record has been updated");
else
System.out.println("Record cannot be updated");
ResultSet rs=s.executeQuery("select * from record");
while(rs.next())
{
System.out.println("name ="+rs.getString(1)+"salary="+rs.getString(2));
}
}
catch(SQLException e)
{
System.out.println(e);
}
catch(Exception ei)
{
System.out.println(ei);
}
}
}