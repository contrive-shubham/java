class test
{
public static void main(String r[])
{
String s=new String("Hello");
String s1="Hello";
String s2=s.intern();
if (s1==s2)
{
System.out.println("ref matched");
}
else
{
System.out.println("ref not matched");
}
}
}
