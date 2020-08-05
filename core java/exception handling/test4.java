class test4
{
 public static void main(String...s)
{
  try
  {

  int x=10/0;//this is exception
 byte y[]=new byte[5];
    y[100]=10;
 
   }
   catch(Exception e)
   {
    System.out.println(e);
   }

  }
}