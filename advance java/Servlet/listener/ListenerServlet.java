import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class ListenerServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
                                  out = res.getWriter();
out.println("<html><body>");
ServletContext ctx = getServletContext();
try
{Connection c = (Connection)ctx.getAttribute("con");

Statement s = c.createStatement();
ResultSet rs = s.executeQuery("select *from emp");
while(rs.next())
{
out.println(rs.getString(1));
out.println(rs.getString(2));
out.println("<br>");

}}
catch(Exception e){}

out.println("</body></html>");
}
}
