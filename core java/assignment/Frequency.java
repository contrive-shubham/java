import java.util.Scanner;
public class Frequency
{
	public static void main(String...args)
	{
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetre Element String ");
		String str=scan.nextLine();
        String[] words = str.split(" ");
        System.out.println("Eneter word to count Frequency in this String : ");
        String str1=scan.nextLine();
        for(int i=0;i<words.length;i++)
        {
        	if(str1.contentEquals(words[i]))
        	{
        		count++;
        	}
        }
		System.out.println("Frequency of "+str1+" in this String is : "+count);
	}
}
