import java.io.*;
import java.net.*;

class Server
{

      public  static void main(String args[]) throws Exception

 
        {
         //create a server socket with some port number
          ServerSocket ss = new  ServerSocket(777);

         //let the server wait till a client accepts connection
            Socket s =  ss.accept();

          System.out.println("Connection established ");

         //attech the output stream to the server socket
          OutputStream  obj = s.getOutputStream();
          //attech the print stream to send data to the server socket
          PrintStream ps = new PrintStream(obj);

            String str = "Hello client  ";

ps.println(str);
ps.println("now server send data to client ");

ps.println("Bye");


ps.close();
ss.close();
s.close();
}
}