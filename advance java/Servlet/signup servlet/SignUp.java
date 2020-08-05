import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SignUp extends HttpServlet

{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
{
	
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	String n=req.getParameter("userName");
	String p=req.getParameter("userPassword");
	String e=req.getParameter("userEmailId");
	String t=req.getParameter("userTel");

try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
	PreparedStatement ps=c.prepareStatement("insert into signupuser values(?,?,?,?)");
	

	ps.setString(1,n);
	ps.setString(2,p);
	ps.setString(3,e);
	ps.setString(4,t);

	

	int i=ps.executeUpdate();
	if(i>0)
	out.print("you are successfully signed up...");

}


	catch(Exception e2)
	{
	System.out.println(e2);
	}
out.close();
}
}