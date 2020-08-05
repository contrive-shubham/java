import java.io.*;
import java.net.*;
import java.util.*;
class Details

{

        public static void main(String args[]) throws IOException

 {  

        URL obj = new URL("http://www.yahoo.com/index.html");

        URLConnection conn = obj.openConnection();
         
        System.out.println("Date: " +new  Date(conn.getDate()));
        System.out.println("\n content type : " +conn.getContentType());
        System.out.println("\n  Expiry : "+conn.getExpiration());
         System.out.println("\n  last modified : "+new Date(conn.getLastModified()));

int l  =conn.getContentLength();

if(l==0)
{

        System.out.println("content not available ");

         return;
}






else

{
           int ch;
       InputStream in = conn.getInputStream();
        while((ch = in.read())!=-1)
          System.out.print((char)ch);
}
}
}