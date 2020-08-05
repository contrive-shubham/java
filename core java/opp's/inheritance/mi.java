class dadaji
{
 int x =10;
}
class papaji extends dadaji
{ int x=20;
}
class child extends papaji
{
 int x=30;
void show()
{ 
System.out.println(x);
System.out.println(super.x);
System.out.println(((dadaji)this).x);
System.out.println((dadaji)this);
}
public static void main(String...s)
{ 
child c=new child();
c.show();
}
}