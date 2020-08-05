class Reserve implements Runnable
{
//Available birth are=1
int available=1;
int wanted;
//accepted wanted berth at run time
Reserve(int i)
{
wanted=i;
}
public void run()
{
synchronized(this)
{
//display available birth
System.out.println("Available biirth"=+Available);
if(available>=wanted)
{
String name=thread.currentThread().getName();
System.out.println(wanted+"birthreserved for"+name);
try
{
Thread.sleep(2000);
available=available-wanted;
}
catch(InterruptedException ie)
{
}
else
System.out.println("sorry,no birth available");
}
}
}
class safe
{
public static void main(String args[])
{
Reserve obj=new Reserve(1);
Thread t1=new Thread(obj);
Thread t2=new Thread(obj);
t1.setName("first person");
t2.setName("second person");
t1.start();
t2.start();
}
