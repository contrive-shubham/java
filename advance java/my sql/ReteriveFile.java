import java.io.*;
import java.sql.*;
public class ReteriveFile{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
PreparedStatement ps=con.prepareStatement("select * from filetable");
ResultSet rs=ps.executeQuery();
rs.next();
Clob c=rs.getClob(2);
Reader r=c.getCharacterStream();
FileWriter fw=new FileWriter("D:\\javaadvanced\\addmethod.java");
int i;
while((i=r.read())!=-1)
fw.write((char)i);
System.out.println(i);
fw.close();
con.close();
System.out.println("success");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}