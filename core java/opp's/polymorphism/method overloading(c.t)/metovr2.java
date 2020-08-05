// method overloading with static method and without making object
class metovr2
{ static void sum(int x,float y)
{ System.out.println(x+y);
}
static void sum(int x,float y,double z)
{ System.out.println(x+y+z);
}
public static void main(String...s)
{ // metovr2 t1=new metovr2();
 sum(20,20.5f,30.6);
 sum(20,30.5f,30.7);
}
}