class test1
{
 public static void main(String...s)
{
  try
  {
 int x=10/0;//this is exception
 int y[]=new int[5];
  y[100]=10;
 }
  catch(ArithmeticException e)
  {
    System.out.println(e);
   }
     catch(ArrayIndexOutOfBoundsException r)
  {
    System.out.println(r);
   }

  }
}