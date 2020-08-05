import java.util.*;
class Student
{
String name;
int rollno;
Student(String name,int rollno)
{
this.name=name;
this.rollno=rollno;
}
public String toString()
{
return(name+" "+rollno);
}
public boolean equals(Object o)
{
Student st=(Student)o;
return(rollno==st.rollno);
//boolean b=(rollno==st.rollno);
//sop((rollno==st.rollno));
}

public int hashCode()
{
//return(rollno);
return(rollno%10);
}
}


class HashSetTest1
{
public static void main(String args[])
{
HashSet hs=new HashSet();
hs.add(new Student("abc",101));
hs.add(new Student("xyz",102));
hs.add(new Student("pqr",103));

System.out.println("Size of the ArrayList is "+hs.size());
Iterator itr=hs.iterator();

while(itr.hasNext())
{
Student st=(Student)itr.next();
System.out.println(st.name+" "+st.rollno);
}
System.out.println("contains xyz,102"+hs.contains(new Student("xyz",102)));
System.out.println("remove xyz,102"+hs.remove(new Student("xyz",102 )));
System.out.println("contains xyz,102"+hs.contains(new Student("xyz",102)));
System.out.println("Size of the HashSet is "+hs.size());
}
}