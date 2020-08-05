//non static member changed to static member
class emp
{
int eid;
String ename;cname;
void setdata(int e,string en,string cn)
eid=e;
ename=en;
ename=cn;
}
void getdata()
{
System.out.println(eid)
System.out.println(ename)
System.out.println(cname)
}
public static void main()
{
emp e1=new emp();
e1.setdata(1,ram,tcs);
e1.getdata();
emp e2=new emp();
e2.setdata(2,shyam,tcs);
e2.getdata();
emp e3=new emp();
e3.setdata(3,pooja,tcs);
e3.getdata();
}

