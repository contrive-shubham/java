

import javax.servlet.*;
import java.io.*;

public class MyServlet implements Servlet
{
	public void init(ServletConfig cfg)
	{
		System.out.println("servlet object created");
	}
	public void service(ServletRequest  req , ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");//to set the response type

		PrintWriter out=res.getWriter();// to get the output stream

		String user=req.getParameter("txtname");	
			
		out.println("<center><font color='red'>Hello  "+user+"</font></center>");	
		System.out.println("hello "+user);

	}
	
	public void destroy()
	{
	}
	public String getServletInfo()
	{
		return(null);	
	}
	public ServletConfig getServletConfig()
	{
		return(null);
	}
}
		
	






		
