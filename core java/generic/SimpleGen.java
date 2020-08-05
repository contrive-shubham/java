class  TwoGen<T,V>{

T ob1;
V ob2;


TwoGen(T   o1,V  o2)

{
ob1 = o1;
ob2 = o2;
}

void showTypes(){


System.out.println("Types  of T  is "+ob1.getClass().getName());

System.out.println("Types of v is"+ob2.getClass().getName());
}

T  getob1(){

return ob1;
}

V  getob2(){
return ob2;
}}

public class  SimpleGen{

public static void main(String args[])
{

TwoGen<Integer,String> tgObj  =  new TwoGen<Integer,String>(88,"Generics");

tgObj.showTypes();
int v  = tgObj.getob1();
System.out.println("Value:"+v);
String str = tgObj.getob2();
System.out.println("value:"+str);
}
}

/*
Types  of T  is java.lang.Integer
Types of v isjava.lang.String
Value:88
value:Generics

*/