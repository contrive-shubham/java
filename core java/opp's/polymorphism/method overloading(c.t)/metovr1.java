//method overloading using different datatype
class metovr1
{ void sum(int x,float y)
{ System.out.println(x+y);// here priority will be given to float
}
void sum(int x,float y,double z)
{ System.out.println(x+y+z);// here priorty will be given to double
}
public static void main(String...s)
{ metovr1 t1=new metovr1();
 t1.sum(10,20.5f);
 t1.sum(20,20.5f,30.5);
}
}