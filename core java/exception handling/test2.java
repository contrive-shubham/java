class test2
{
 public static void main(String...s)
{
  try
  {
 int x=10/0;
 int y[]=new int[5];
  y[10]=1000;
 }
  catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
  {
    System.out.println(e);
     }
   }
}