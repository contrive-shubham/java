// need of parameterized constructor
class emp2
{ int eid;
 String ename;
 String cname;
 emp2()
 { eid=5;
 ename="java";
 cname="sunmicrosystem";
}
emp2(int eid,String ename,String cname)
{ this.eid=eid;
 this.ename=ename;
 this.cname=cname;
}
void show()
{System.out.println(eid);
System.out.println(ename);
System.out.println(cname);
}
public static void main(String...s)
{ emp2 e1=new emp2();
 e1.show(1,"anjali","tcs");
 emp2 e2=new emp2();
 e2.show(2,"riya","TCS");
 emp2 e3=new emp2();
 e3.show();
}
}