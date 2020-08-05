class Myclass
{
static<T>void display(T[] arr)
{
for(T i:arr)
System.out.println(i);
}
}
class gen2
{
public static void main(String...s)
{
Integer arr1[]={1,2,3,4,5};
System.out.println("reading Integer object:");
Myclass.display(arr1);
Double arr2[]={1.2,1.5,1.7,1.8,1.9};
System.out.println("reading Double object:");
Myclass.display(arr2);
String arr3[]={"ram","shuay","geeta","sita","aman"};
System.out.println("reading String object:");
Myclass.display(arr3);
}
}