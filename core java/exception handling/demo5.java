class demo5
{
int age;
void get(int age) 
  {
  if(age>18)
{
  try
 {
  throw new ArithmeticException("invalid age");

  }
  catch(ArithmeticException e)
 {
    System.out.println(e);
 
   }
}

    else
  {
   this.age=age;
  System.out.println(age);
 }
}

   public static void main(String...s)
{
  demo5 d=new demo5();
     d.get(30);
 
}
}