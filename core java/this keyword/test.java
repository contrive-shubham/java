//internal code in this keyword
class test
{
int x=10;
void show(int x,int z)
{
System.out.println(x);//20
System.out.println(z.x);//10
}
public static void main(String...s)
{
test t1=new test();
t1.show(20,t1);
}
}
