class mythread1 implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
}
}
}
class mythread2 implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i);
}
}
}
class Main
{
public static void main(String...s)
{
mythread1 m1=new mythread1();
Thread t1=new Thread(m1);
t1.start();
mythread2 m2=new mythread2();
Thread t2=new Thread(m2);
t2.start();
}
}

