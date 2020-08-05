import java.util.Scanner;
import java.lang.Math;
public class HeapSort
{
	HeapSort()
	{ 
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size Array: ");
		int n=scan.nextInt();
		int array[] = new int[n+1];
	    int b[]=new int[n];
		System.out.println("Enter Array of Size : "+n);
		for(int i=0;i<n;i++) 
			{ array[i]=scan.nextInt(); }
		for(int p=n/2-1;p>=0;p--)
			{ MaxHeapify(array,p,n+1);   }
		for (int k=0;k<n;k++)
			b[k]=HEAPEXTRACTMAX(array,n-1);
		for (int j=n-1;j>=0;j--)
			System.out.println(b[j]);
	}
	void MaxHeapify(int array[],int x, int n)
	{   
		int largest,temp=0;
		int l=(x*2);
		int r=(x*2)+1;
		if(l <= n && (array[l] > array[x]))
			largest =l;
		else
			largest= x;
		if(r<=n && array[r]>array[largest])
			largest =r;
		if (largest != x)
		{
			temp=array[x];
			array[x]=array[largest];
			array[largest]=temp;
			MaxHeapify(array,largest,n);
		}
	}
	public int HEAPEXTRACTMAX(int array[] ,int n)
	{
		if (n<1)
			System.out.println("heap overflow");
		int max=array[0];
		array[0]=array[n];
		MaxHeapify(array,0,n-1);
		return max;
	}
	public static void main(String...args)
	{
		 new HeapSort();
	}
}
