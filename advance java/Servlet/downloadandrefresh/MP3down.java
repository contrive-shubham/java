import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MP3down extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		String name="murli.mp3";
		BufferedInputStream buf=null;
		ServletOutputStream sos=null;
		try{
			res.setContentType("video/impeg");
			sos=res.getOutputStream();
			//String s1=getServletContext().getRealPath("data/inch.mp3");
                        String s1=getServletContext().getRealPath("data/murli.mkv"); 
			File f=new File(s1);
			FileInputStream fin=new FileInputStream(f);
			buf=new BufferedInputStream(fin);
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