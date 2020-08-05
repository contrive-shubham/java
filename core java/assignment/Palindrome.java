import java.util.Scanner;
public class Palindrome
{
	public static void main(String...args)
	{
		String str1="";
		Scanner in =new Scanner(System.in);
	    System.out.println("Eneter a String");
	    String str=in.nextLine();
	    for(int i=str.length() -1; i>=0 ;i--)
	    {
	    	str1=str1 + str.charAt(i);
	    }
	    if(str1.contentEquals(str))
	    {
	    	System.out.println("String is a palindrome");
	    }
	    else
	    {
	    	System.out.println("String is not a palindrome");
	    }
	    
	}
}
