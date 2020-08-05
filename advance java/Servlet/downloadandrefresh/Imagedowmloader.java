import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Imagedowmloader extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		String name="img.jpg";
		BufferedInputStream buf=null;
		ServletOutputStream sos=null;
		try{
			sos=res.getOutputStream();
			String s1=getServletContext().getRealPath("data/img.jpg");
			File f=new File(s1);
			FileInputStream fin=new FileInputStream(s1);
			buf=new BufferedInputStream(fin);
			res.setContentType("image/jpeg");
			res.addHeader("content_dispostion","attachement;Filename="+name);
			res.setContentLength((int)f.length());
			int data=0;
			while((data=buf.read())!=-1)
			{
				sos.write(data);
			}
		}catch(Exception e){}
	}
}
