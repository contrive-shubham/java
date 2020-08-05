
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet1 extends HttpServlet
{
public void Service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();

String user=req.getParameter("txtname");

RequestDispatcher dispatcher=req.getRequestDispatcher("Servlet2");

out.println("welcome "+user);

dispatcher.include(req,res);
//dispatcher.forward(req,res);

out.println("<br> thank you");
}
}

