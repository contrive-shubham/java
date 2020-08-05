import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class Refresh extends HttpServlet
{
	static int count=0;
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		res.setHeader("Refresh","3");
		out.println(new Date().toString()+"time"+count++);
	}
}