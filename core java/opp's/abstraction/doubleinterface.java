interface my1
{
void show();
}
interface my2
{
void disp();
}
class child implements my1,my2
{
public void show()
{
System.out.println("child show");
}
public void disp()
{
System.out.println("child disp");
}
public static void main(String...s)
{
child c= new child();
c.show();
c.disp();
}
}


