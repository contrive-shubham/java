import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="Demoanno",urlPatterns={"/hello"})
public class Demoanno extends HttpServlet
{
	public void service(HttpServletRequest req , HttpServletResponse res)throws IOException , ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
                                          out.println("<html><body>");
                                          out.println("hello servlet by annotation");
                                          out.println("</body></html>");                   
                                          out.close();
}
}
	
                                          