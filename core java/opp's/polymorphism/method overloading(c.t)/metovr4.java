// program for method overloading when return type are different 
class metovr4
{ public static void sum(char c,String st)
{ System.out.println(c+st);
}
double sum(int x,float y,double z)
{ System.out.println(x+y+z);
}
public static void main(String...s)
{ metovr4 t1=new metovr4();
  t1.sum('A',"njali");
  double t2=t1.sum(10,20.5f,30.6);
  System.out.println(t2);

}
}