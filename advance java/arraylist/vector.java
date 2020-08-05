import java.util.*;
class TestVector
{
public static void main(String args[])
{
Vector<String> v=new Vector<String>();
v.add("ram");
v.addElement("puja");
v.addElement("sachin");
Enumeration e=v.elements();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
}
}