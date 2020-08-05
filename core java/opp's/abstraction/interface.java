interface my
{
void show();
}
class child implements my
{
public void show()
{
System.out.println("child show call");
}
public static void main(String...s)
{
child c= new child();
c.show();
} 
}