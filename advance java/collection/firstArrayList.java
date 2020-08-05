import java.util.*;
class firstArrayList
{
public static void main(String...s)
{
ArrayList al=new ArrayList();
al.add("ram");
al.add("shyam");
al.add("java");
al.add("j2ee");
System.out.println(al);
System.out.println(al.size());
ArrayList al1=new ArrayList();
al1.add(10);
al1.add(20);
al1.addAll(al);
System.out.println(al1.size());
System.out.println(al1);
}
}