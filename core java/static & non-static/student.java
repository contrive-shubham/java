//non static member changed to static member
class student
{
int sid;
String sname,colname;
void setdata(int si,String sn,String col)
{
sid=si;
sname=sn;
colname=col;
}
void getdata()
{
System.out.println(sid);
System.out.println(sname);
System.out.println(colname);
}
public static void main(String...s)
{
student s1=new student();
s1.setdata(1,"shubham","iit");
s1.getdata();
student s2=new student();
s2.setdata(2,"deep","iit");
s2.getdata();
System.out.println(s2);
}
}
