import java.io.*;
import java.sql.*;
public class StoreFile{
public static void main(String[]args){
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
PreparedStatement ps=c.prepareStatement("insert into filetable values(?,?)");
File f=new File("d:\\hello.java");
FileReader fr=new FileReader(f);
ps.setInt(1,101);
ps.setCharacterStream(2,fr,(int)f.length());
int i=ps.executeUpdate();
System.out.println(i+" records affected");
c.close();
}
catch(Exception e){e.printStackTrace();}
}
}