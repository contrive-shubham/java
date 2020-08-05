import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Pdfdownload extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		String fname="C.pdf";
		ServletOutputStream sos=null;
		BufferedInputStream buf=null;
		try{
			sos=res.getOutputStream();
			String s1=getServletContext().getRealPath("data/C.pdf");
			File f=new File(s1);
			res.setContentType("application/pdf");
			res.addHeader("content_Dispostion","attachment;filename="+fname);
			res.setContentLength((int)f.length());
			FileInputStream input=new FileInputStream(s1);
			 buf=new BufferedInputStream(input);
			int readbytes=0;
			while((readbytes=buf.read())!=-1)
			{
				sos.write(readbytes);
			}
		}catch(Exception e){}
	}
}