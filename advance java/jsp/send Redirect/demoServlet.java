import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class demoServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();

res.sendRedirect("http://www.google.com");
pw.close();
}
}

