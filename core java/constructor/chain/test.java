class test
{
test()
{
this (10);
System.out .println("default constructor call");
}
test(int x)
{
this(10,20);
System.out.println(x);
}
test(int x,int y)
{
System.out.println(x+y);
}
public static void main(String[] args)
{
new test();
}
}
