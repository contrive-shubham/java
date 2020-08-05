class emp1
{
 int eid;
String ename;
static String cname="";
void input(int e,String en)
{ 
eid=e;
ename=en;
}
static void Cchange(String cn)
{
 cname=cn;
}
void show()
{ 
System.out.println(eid);
System.out.println(emp.ename);
System.out.println(cname);
}
public static void main(String...s)
{
emp1.Cchange ("Google");
emp1 e1=new emp1();
e1.input(1,"Anjali");
emp.show();
emp1 e2=new emp1();
e2.input(2,"Mansi");
e2.show();
emp1 e3=new emp1();
e3.input(3,"Shakina Begum");
e3.show();
}
}