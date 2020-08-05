import java.util.*;
class Arraylist
{
public static void main(String...s)
{
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(30);
Iterator i=al.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}
