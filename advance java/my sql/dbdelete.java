import java.sql.*;
import java.util.*;
import java.io.*;
class  dbdelete
{
public static void main(String a[]) throws Exception
{
Scanner in=new Scanner(System.in);
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
Statement s=c.createStatement();
System.out.println("Enter the name you want to delete");
String name1=in.nextLine();
System.out.println("You entered name"+name);
int x=s.executeUpdate("Delete record "where name='"+name+"'");
if(x==1)
System.out.println("Record has been deleted");
else
System.out.println("Record cannot be deleted");
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