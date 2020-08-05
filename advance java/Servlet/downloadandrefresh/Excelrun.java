import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Excelrun extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("application/vnd.ms-excel");
		pw.println("name\thindi\tenglish\tmath\tresult");
		pw.println("himanshu\t80\t80\t80\t=sum(b2:d2)");
	}
}