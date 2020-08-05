import java.io.*;
class MyFileWriter
{
public static void main(String args[])throws IOException
{
FileOutputStream fw=new FileOutputStream("abc.txt");
String s="India is good country";
byte ch[]=s.getBytes();
for(int i=0;i<ch.length;i++)
{
fw.write(ch[i]);
}
fw.close();
System.out.println("file created sucessfully");
}
}
