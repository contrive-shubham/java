import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class VisitServlet extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
  {
res.setContentType("text/html");
PrintWriter out=res.getWriter();

String user=req.getParameter("uname");

out.println("SORRY "+user);
out.println("<br>SITE IS UNDER CONSTRUCTION");
}

  }
