import java.io.*;
class demo
{
public static void main(String...s)throws Exception
{
FileOutputStream fr = new FileOutputStream("ab.txt");
PrintStream ps=new PrintStream(fr);
ps.println("hi");
ps.println("java");
}
}