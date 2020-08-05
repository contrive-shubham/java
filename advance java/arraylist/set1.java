import java.util.*;
class Hasset
{
public static void main(String...s)
{
HashSet hs=new HashSet();
hs.add("ram");
hs.add("java");
hs.add("manih");
hs.add("java");
System.out.println(hs.add("j2ee"));
Iterator i=hs.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}