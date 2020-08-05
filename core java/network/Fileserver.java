 //A server that sends a file content to  the client

import java.io.*;
import java.net.*;


class FileServer

{

             public static void main(String  args[]) throws Exception

   {


          ServerSocket ss =new ServerSocket(8888);

           Socket s =ss.accept();
System.out.println("connection established ");


  // to accept file content from client

 BufferedReader  in = new BufferedReader(new InputStreamReader(s.getInputStream()));



// to send file content to  client

 DataOutputStream out = new DataOutputStream(s.getOutputStream());

String fname =in.readLine();

FileReader fr =null;

 BufferedReader file =null;


boolean flag;


File f = new File(fname);


if(f.exists())
  flag =true;

else

 flag =false;


if(flag ==true)

out.writeBytes("yes"+"\n");

else

out.writeBytes("No " +"\n");



if(flag ==true)
{



fr = new FileReader(fname);
file = new BufferedReader(fr);

String str;


while((str= file.readLine())!=null)


 {  out.writeBytes(str + "\n");



}


file.close();
out.close();
in.close();
 fr.close();
s.close();
ss.close();

}

}

}

 




