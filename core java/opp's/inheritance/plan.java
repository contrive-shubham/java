abstract class plan
{
abstract void getrate();
}
class comercial extends plan
{
int rate,unit;
void getrate()
{
rate=5;
unit=10;
System.out.println("bill gen"+(unit*rate));
}
}
class domestic extends plan
{
int rate,unit;
void getrate()
{
rate=7;
unit=15;
System.out.println("bill gen"+(unit*rate));
}
public static void main(String...s)
{
plan p1=new comercial();
p1.getrate();
plan p2=new domestic();
p2.getrate();
}
}