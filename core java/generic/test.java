class mygen<g>
{
g obj1;
mygen(g obj1)
{
System.out.println(obj1);
}
g getobj(g obj1)
{
return(obj1);
}
}
class test
{
public static void main(String...s)
{
Integer i=10;
mygen<Integer> t1=new mygen<Integer>(i);
System.out.println(t1.getobj(20));
Float f1=10.5f;
mygen<Float> t2=new mygen<Float>(f1);
System.out.println(t2.getobj(50.5f));
String ss="puja";
mygen<String> t3=new mygen<String>(ss);
System.out.println(t3.getobj("ram"));
}
}