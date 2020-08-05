// a client that sends data and receive data

import  java.io.*;
import java.net.*;

class Client2
{
   public static void main(String args[]) throws Exception

 {Socket s  = new Socket("localhost",8888);


//Socket s  = new Socket("117.226.145.16",8888);

          //to send data to server
DataOutputStream dos = new DataOutputStream(s.getOutputStream());

       //to read data coming from server

BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));



           // to reade data from keyboard

BufferedReader kb  = new BufferedReader(new InputStreamReader(System.in));

String str,str1;
//repeat as long as exit is not typed at client
while(!(str=kb.readLine()).equals("exit"))

{

        dos.writeBytes(str + "\n"); //send to server

         str1 = br.readLine();      //received from server

         System.out.println(str1);
}





//close connection


dos.close();
br.close();

kb.close();
s.close();

}
}