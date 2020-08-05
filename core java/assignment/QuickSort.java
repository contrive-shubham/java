import java.util.Scanner;
public class QuickSort
{
	QuickSort()
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
			int q=partition(array,p,r);
			Sort(array,p,q-1);
			Sort(array,q+1,r);
		}
	}
	int partition(int array[],int l,int h)
	{ 
        
      int temp, pivot, flag;     
      pivot = l;    
      flag = 0;  
      while(flag != 1)  
      {  
          while((array[pivot] <= array[h]) && (pivot!=h))  
          h--;  
          if(pivot==h)  
          flag =1;  
          else if(array[pivot]>array[h])  
          {  
              temp = array[pivot];  
              array[pivot] = array[h];  
              array[h] = temp;  
              pivot = h;  
          }  
          if(flag!=1)  
          {  
              while((array[pivot] >= array[l]) && (pivot!=l))  
              l++;  
              if(pivot==l)  
              flag =1;  
              else if(array[pivot] <array[l])  
              {  
                  temp = array[pivot];  
                  array[pivot] = array[l];  
                  array[l] = temp;  
                  pivot = l;  
              }  
          }
      }
      return pivot;  
	}
	public static void main(String...args)
	{
		new QuickSort();
	}
}

