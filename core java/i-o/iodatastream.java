import java.io.*;
class datastream
{
public static void main(String...s1)throws Exception
{
DataInputStream di = new DataInputStream(System.in);
FileOutputStream fr = new FileOutputStream("a.txt");
DataOutputStream dout = new DataOutputStream(fr);
PrintStream ps = new PrintStream(fr);
String s=" ";
while(!s.equals("stop"))
{
s=di.readLine();
dout.writeUTF(s);
}
di.close();
dout.close();
}}