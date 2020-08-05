class checkFinally
{
 
   static int show()
{
  try
  {

   return 10;
 
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
 finally
 {
   return 20;
  }
}
  public static void main(String...s)
{
   int x=show();
   System.out.println(x);

  }
}

//output =20;