//abstraction
abstract class animal
{ 
abstract void fly();
void nonfly();
{
}
class bird extends animal
{ 
void fly()
{ 
System.out.println("bird fly animal");
}
void show()
{ 
System.out.println("bird show call");
}
public static void main(String...s)
{
 bird b=new bird();
b.fly();
b.nonfly();
b.show();
}
}
