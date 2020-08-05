import java.util.Scanner;
public class UnionOfArrays
{
	public static void main(String...args)
	  {
		  new UnionOfArrays();
	  }
	UnionOfArrays()
	{
		   int flag=0;
		   Scanner scan =new Scanner(System.in);
		   System.out.println("Enter Size of First Array : ");
	       int n1=scan.nextInt();
	       int array1[]= new int[n1];
		   System.out.println("Enter Array of Size : "+n1);
		   for(int i=0;i<n1;i++)
			 array1[i]=scan.nextInt();
		   if(n1 >1 )
			   array1 = RemoveDuplicacy(array1,n1);
		   System.out.println("Enter Size of Second Array : ");
	       int n2=scan.nextInt();
	       int array2[]= new int[n2+n1];
	       if(n2 >1 )
			   array2 = RemoveDuplicacy(array2,n2);
		   System.out.println("Enter Array of Size : "+n2);
		   for(int i=0;i<n2;i++)
			 array2[i]=scan.nextInt();
		   for(int i=0;i<n1;i++)
		   {
			   flag=0;
			   for(int j=0;j<n2;j++)
			   {
				   if(array1[i]==array2[j])
				   {
					   flag=1;
					   n2--;
					   break;
				   }
			   }
			   if(flag==0)
			   {
				   array2[n2+i]=array1[i];
			   }
		   }
		   System.out.println("Enter Arrays are  : ");
		   for(int i=0;i<(n1+n2);i++)
			   System.out.print(array2[i]+" ");
	}
	int[] RemoveDuplicacy(int array[],int n)
	{ 
	        int[] temp = new int[n]; 
	        int p = 0; 
	        for (int q=0; q<n-1; q++) 
	            if (array[q] != array[q+1]) 
	                temp[p++] = array[q]; 
	        temp[p++] = array[n-1];    // this is last element of array that can not be further comparable.
	        for (int q=0; q<p; q++) 
	            array[q] = temp[q]; 
	        return array;
	}
  
}
