class demo
{
 public static void main(String...s)
{
try
{
 int x=10/0;//this is exception
 }
catch(ArithmeticException t)
 {
  System.out.println(t);
 }
}
}