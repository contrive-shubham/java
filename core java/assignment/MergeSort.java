import java.util.Scanner;
public class MergeSort
{
	MergeSort()
	{ 
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size Array: ");
		int n=scan.nextInt();
		int array[] = new int[n+1];
		System.out.println("Enter Array of Size : "+n);
		for(int i=0;i<n;i++) 
			{ array[i]=scan.nextInt(); }
		Sort(array,0,n-1);
		for(int i=0;i<n;i++) 
		{ System.out.print(array[i]+" ");}
	}
	void Sort(int array[], int p, int r)
	{
		if(p<r)
		{
			int q= (p+r)/2;
			Sort(array,p,q);
			Sort(array,q+1,r);
			Merge(array,p,q,r);
		}
	}
	void Merge(int array[],int l,int m,int h)
	{ 
	  int i=1,j=1; 
      int n1=m-l+1;
      int n2=h-m;
      int L1[]=new int[n1+1];
      int L2[]=new int[n2+1];
      for(int b=1;b<=n1;b++)
    	  L1[b]=array[l+b-1];
      for(int k=1;k<=n2;k++)
      { L2[k] = array[m+k]; }
      L1[n1+1] = 2147483647;
      L2[n2+1] = 2147483647;
      for(int k=l;k<=h;k++)
      {
    	  if(L1[i]<=L2[i])
    	  {
    		  array[k]=L1[i];
    		  i++;
    	  }
    	  else
    	  {
    		  array[k]=L2[j];
    		  j++;
    	  }
      }
      
      
	}
	public static void main(String...args)
	{
		new QuickSort();
	}
}
