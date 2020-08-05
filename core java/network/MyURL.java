import java.io.*;
import java.net.*;

class MyURL
{

public static void main(String args[]) throws Exception

{


URL obj =new URL("http://www.facebook.com/index.html");

System.out.println("protocol : "+obj.getProtocol());
System.out.println("Host: "+obj.getHost());
System.out.println("File: "+obj.getFile());
System.out.println("port: "+obj.getPort());
System.out.println("path: "+obj.getPath());
System.out.println("External form: " +obj.toExternalForm());
}
}