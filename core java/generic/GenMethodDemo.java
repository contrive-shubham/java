public   class GenMethodDemo
{

//Determine  it  an object  is in array


static < T,v extends T  >boolean  isln(T x ,v[] y){


for(int i = 0;i<y.length;i++)

if(x.equals(y[i]))

  return  true;

return false;
}

static  <T  extends  Number>  double  add(T x,T y)


{

double d =  x.doubleValue()+y.doubleValue();

return d;

}


public static void main(String args[]){

//use  isln()   on Integers

Integer  nums[] =  {1,2,3,4,5};

if(isln(2,nums))

System.out.println("2 is in nums");
if(isln(7,nums))

System.out.println("7 is  not in nums");


//use isln on string
String strs[] = {"one","two","three","four","five"};


if(isln("two",strs))

System.out.println(" two is in str");

if(isln("seven",strs))

System.out.println("seven in not str");


System.out.println(add(10,20));

}}

/*2 is in nums
 two is in str
30.0
*/