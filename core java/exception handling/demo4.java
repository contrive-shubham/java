class demo4
{
 void show()throws ArithmeticException,ArrayIndexOutOfBoundsException 
 {
  int x=10/0;
 int y[]=new int[5];
    y[100]=10;
 
   }
   public static void main(String...s)//throws Exception
{
  demo4 d=new demo4();
     d.show();
   /*demo4 d=new demo4();
  try
 {
  d.show();

  }
  catch(Exception e)
{
   System.out.println(e); */
//}
}
}