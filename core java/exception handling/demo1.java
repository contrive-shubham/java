class demo1
{
 public static void main(String...s)
{
  try
  {

  int x=10/0;//this is exception
 
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
 finally
 {
   System.out.println("har hal me exe");
   }

  }
}