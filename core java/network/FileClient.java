import java.io.*;
import java.net.*;

class FileClient

{


 
    public static void main(String arg[]) throws Exception


    {
      //create client socket
      Socket s =new Socket("localhost",8888);
      //accept filename from keyboard  
BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the filename ");

String fname =kb.readLine();
//send filename to the server using dataoutputstream
DataOutputStream out  = new  DataOutputStream(s .getOutputStream());

out.writeBytes(fname + "\n");


// to read data coming from the server
BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

String str ;
///  read first line from server into str
 str =in.readLine();
//if file is found server returns yes ,else No     
if(str.equals("yes"))
 
{
        //read and display the file contents coming from server
while((str = in.readLine()) !=null)

           System.out.println(str);
//close connection by closing the streams
kb.close();
out.close();
in.close();
s.close();
}

else

 
System.out.println("file not found ");
}
}