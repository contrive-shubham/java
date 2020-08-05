class emp
{ 
int eid;
String ename;
static String cname="TCS";
void setdata(int e,String en)
{
 eid=e;
ename=en;
}
void getdata()
{
 System.out.println(eid);
System.out.println(ename);
System.out.println(emp.cname);
}
public static void main(String...s)
{ 
emp e1=new emp();
e1.setdata(1,"anjali");
e1.getdata();
emp e2=new emp();
e2.setdata(2,"riya");
e2.getdata();
}
}