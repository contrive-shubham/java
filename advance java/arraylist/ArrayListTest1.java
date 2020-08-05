import java.util.*;
class Student
{
String name;
int rollno;
Student(int rollno,String name)
{
this.name=name;
this.rollno=rollno;
}
public String toString()
{
return(rollno+" "+name);
}
public boolean equals(Object ob)
{
Student st=(Student)ob;
return(rollno==st.rollno && name.equals(st.name));
}
}
class ArrayListTest1
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add(new Student(101,"abc"));
al.add(new Student(102,"xyz"));
al.add(new Student(103,"pqr"));
al.add(new Student(104,"mno"));
al.add(new Student(105,"ijk"));
System.out.println("Size of the ArrayList is"+al.size());
Iterator itr=al.iterator();
System.out.println("Rollno  Name");
while(itr.hasNext())
{
Student st=(Student)itr.next();
System.out.println(" "+st.rollno+" "+st.name);
}
System.out.println("contains 105 ijk"+al.contains(new Student(105,"ijk")));
System.out.println("remove 105 ijk"+al.remove(new Student(105,"ijk")));
System.out.println("contains 105 ijk"+al.contains(new Student(105,"ijk")));
System.out.println(al);
}
}