class student
{
public int roll_no;
public String name;
student(int roll_no,String name)
{
this.roll_no=roll_no;
this.name=name;
}
}
class GFG
{
public static void main(String []args)
{
student[]arr;
arr=new student[5];
arr[0]=new student(1,"aman");
arr[1]=new student(2,"ama");
arr[2]=new student(3,"amaj");
arr[3]=new student(4,"amad");
arr[4]=new student(5,"amas");
for(int i=0;i<arr.length;i++)
System.out.println("Element at" + i + ":" + arr[i].roll_no +" "+ arr[i].name);
}
}