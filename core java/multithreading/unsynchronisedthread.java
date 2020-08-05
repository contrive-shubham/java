class mythread1 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
}
}
}
class mythread2 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
try
{
Thread.sleep(1000);
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
mythread2 t2=new mythread2();
t2.start();
}
}

