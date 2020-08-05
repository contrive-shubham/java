//nested try and catch exception handling
class testmorExp
{
 public static void main(String...s)
{
  try
  {
    try
 {

  int x=10/0;//this is exception
 
   }
   catch(ArithmeticException e)
   {
    System.out.println(e);
    }
   int y[]=new int[5];
    y[100]=10;
  }
     catch(ArrayIndexOutOfBoundsException r)
  {
    System.out.println(r);
   }

  }
}