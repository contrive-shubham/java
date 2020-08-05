interface my1
{ void show();
}
interface my2
{
void show();
}
class A implements my1,my2
{ public void show()
{ System.out.println("child show");
}
public static void main(String...s)
{ 
my1 m1=new A();
m1.show();
my2 m2=new A();
m2.show();
}
}