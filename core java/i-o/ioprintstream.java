import java.io.*;
class checkref
{
public static void main(String...s)throws Exception
{
FileOutputStream fr = new FileOutputStream("abcd.txt");
PrintStream ps=new PrintStream(fr);
System.setOut(ps);
System.out.println("hello");
System.setErr(ps);
System.out.println("java");
}
}
