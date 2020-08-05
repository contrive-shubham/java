class Gen<T>
{
T ob;
Gen(T o){
ob=o;
}
T getob(){
System.out.print("gen's getob=");
return ob;
}}
class gen2<T> extends gen<T>
{
Gen2(T o){
super(0);
}
T getobj(){
System.out.println("gen2's getob=");
return ob;
}}
public class HireDemo{
public static void main(String args[]){
Gen<Integer> iob=new Gen<Integer>(88);
Gen2<Integer> iob2=new Gen2<Integer>(89);
Gen2<String> strob2=new Gen2<String>("generic test");
System.out.println(iob.getob());
System.out.println(iob2.getob());
System.out.println(strob2.getob());
}
}

