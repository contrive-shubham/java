import java.util.Scanner;
public class SecondHeighestAndLowest
{
	   SecondHeighestAndLowest()
	   {   int MAX,MIN;
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter Size of Array : ");
		   int n=scan.nextInt();
		   int array[]= new int[n];
		   System.out.println("Enter Array of Size : "+n);
		   for(int i=0;i<n;i++)
			   array[i]=scan.nextInt();  
		   MAX = SecondMax(array);
		   System.out.println("Second Max of array is :"+MAX);
		   MIN = SecondMin(array);
		   System.out.println("Second Min of array is :"+MIN);
	   }
	   public int SecondMax(int array[])
	   {   int max=array[0];
	       int max2=array[0];
		   for(int i=1;i<array.length;i++)
			   if(max < array[i])
			   {   
				   max2=max;
				   max =array[i];
			   }
			   else if(array[i]>max2)
				   max2=array[i];
		       if(max2==max)          // in case of first element of array is Maximum.
               {
        	       max2=array[1];
        	       for(int k=2;k<array.length;k++)
        	       {
        	    	   if(max2 > array[k])
        			   max2=array[k];
        	       }
               }
		   return max2;
	   }
	   public int SecondMin(int array[])
	   {   int min=array[0];
	       int min2=array[0];
	       for(int i=1;i<array.length;i++)
			   if(min > array[i])
			   {   
				   min2=min;
				   min =array[i];
			   }
			   else if(min2 > array[i])
				   min2 =array[i];
	           if(min2==min)           // in case of first element of array is Minimum.
	           {
	        	   min2=array[1];
	        	   for(int k=2;k<array.length;k++)
	        	   {
	        		   if(min2 > array[k])
	        			   min2=array[k];
	        	   }
	           }
		   return min2;
	   }
	   public static void main(String...args)
	   { 
	     new SecondHeighestAndLowest();
	   }
}
