import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet2 extends HttpServlet
{
public void Service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();

String user=req.getParameter("txtname");

out.println("<br>welcome "+user+" in Servlet2");
}
}

