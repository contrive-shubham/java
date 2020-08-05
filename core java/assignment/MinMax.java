import java.util.Scanner;
public class MinMax
{  
   MinMax()
   {   
	   int MAX,MIN;
	   Scanner scan=new Scanner(System.in);
       System.out.println("Enter Size of Array : ");
       int n=scan.nextInt();
       int array[]= new int[n];
	   System.out.println("Enter Array of Size : "+array.length);
	   for(int i=0;i<array.length;i++)
		 array[i]=scan.nextInt(); 
	   MAX = Max(array);
	   MIN = Min(array);
	   System.out.println("Max of array is :"+MAX+" and Min of array is :"+MIN);
   }
   public int Max(int array[])
   {   int max=array[0];
	   for(int i=1;i<array.length;i++)
		   if(max < array[i])
			   max =array[i];
	   return max;
   }
   public int Min(int array[])
   {   int min=array[0];
	   for(int i=1;i<array.length;i++)
		   if(min > array[i])
			   min =array[i];
	   return min;
   }
   public static void main(String...args)
   { 
     new MinMax();
   }
}
