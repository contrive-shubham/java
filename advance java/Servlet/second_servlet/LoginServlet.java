import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse
 res)throws ServletException, IOException
  {
res.setContentType("text/html");
PrintWriter out=res.getWriter();

String user=req.getParameter("txtname");

out.println("welcome "+user);
out.println("<br><a href='Visit?uname="+user+"'>Visit</a>");
}

  }
