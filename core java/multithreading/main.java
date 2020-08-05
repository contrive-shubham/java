class mythread1 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
}
}
}
class Main
{
public static void main(String...s)
{
mythread1 t1=new mythread1();
t1.start();
}
}

