//A server that receive data and sends data 

import java.io.*;
import java.net.*;
class Server2
{

public static void main(String args[]) throws Exception
{
//create server socket
ServerSocket ss = new ServerSocket(8888);
//connect it to client socket
Socket s =ss.accept();

System.out.println("connection established ");
//to send data to the client
PrintStream ps = new PrintStream(s.getOutputStream());
//to read data comming from the client 
BufferedReader br =new  BufferedReader(new InputStreamReader(s.getInputStream()));
//to read data from the keyboard
BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

while(true)//server executes coninuously
{

             String str,str1; 
//repeat as long as client does not send null string

   while((str = br.readLine())!=null)
{
System.out.println(str);//send to client
str1 =kb.readLine();
ps.println(str1);

}

ps.close();
br.close();
kb.close();
ss.close();
s.close();
System.exit(0);
}
}
}




