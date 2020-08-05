import java.io.*;
import java.net.*;

class   Client1
{

public static void main(String args[]) throws Exception
{

//create client socket with same port number
     Socket s =new Socket("localhost",777);
//to read data from the server ,attach inputstream to the socket

  InputStream obj =s.getInputStream();

   BufferedReader br  = new BufferedReader(new InputStreamReader(obj));

//recive strings
String str;

while((str = br.readLine())!=null)
System.out.println("from server : "+str);
br.close();
s.close();
}
}