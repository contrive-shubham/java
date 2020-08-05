import java.io.*;
class MyFileWriter
{
public static void main(String args[])throws Exception
{
FileWriter fw=new FileWriter("ducat.txt");
String s="india is good country";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
fw.write(ch[i]);
}
fw.close();
}
}