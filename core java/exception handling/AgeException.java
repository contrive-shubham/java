//custom Exception
class AgeException extends Exception
{
  AgeException(String s)
{
  super(s);
  }}
class demo6
{
 int age;
 void get(int age)throws AgeException 
  {
  if(age>18)
{
  try
 {
  throw new ArithmeticException("invalid age");
   }
 else
{
  this.age=age;
  System.out.println(age);
 }

  }

   public static void main(String args[])
{
  demo6 d=new demo6();
  try
 {
     d.get(3);
 }
catch(AgeException e)
{
  System.out.println(e);
 }
 
}
}