class mythread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
}
}
}
class demo
{
public static void main(String...s)
{
mythread t1=new mythread();
t1.start();
}
}
