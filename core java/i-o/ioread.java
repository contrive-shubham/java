import java.io.*;
class MyFileReader
{
public static void main(String args[])throws IOException
{
FileInputStream fr=new FileInputStream("abc.txt");
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
fr.close();
}
}