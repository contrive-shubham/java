import java.io.*;
class MyByteWriter
{
public static void main(String args[])throws IOException
{
ByteArrayOutputStream fw=new ByteArrayOutputStream();
String s="India is good country";
byte ch[]=s.getBytes();
for(int i=0;i<ch.length;i++)
{
fw.write(ch[i]);
}
fw.writeTo(new FileOutputStream("abc.txt"));
System.out.println(fw.toString());
byte z[]=fw.toByteArray();//change string to byte type array
ByteArrayInputStream fr=new ByteArrayInputStream(z);
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
}
}
