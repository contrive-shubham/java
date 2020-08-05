import java.util.Scanner;
public class IntersectionOfArrays 
{
	public static void main(String...args)
	  {
		   int flag=0;
		   Scanner scan =new Scanner(System.in);
		   System.out.println("Enter Size of First Array : ");
	       int n1=scan.nextInt();
	       int array1[]= new int[n1];
		   System.out.println("Enter Array of Size : "+n1);
		   for(int i=0;i<n1;i++)
			 array1[i]=scan.nextInt();
		   System.out.println("Enter Size of Second Array : ");
	       int n2=scan.nextInt();
	       int array2[]= new int[n2];
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
					   break;
				   }
			   }
			   if(flag==0)
			   {
				   for(int j=i;j<n1-1;j++)
					   array1[j]=array1[j+1];
				   n1--;
			   }
		   }
		   System.out.println("Intersection of Arrays are  : ");
		   for(int i=0;i<(n1);i++)
			   System.out.print(array1[i]+" ");   
	  }
}
