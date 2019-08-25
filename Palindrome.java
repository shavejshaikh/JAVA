package session1;
import java .util.*;
public class Pali 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int i,n;
		System.out.println("Enter the String:");
		str=sc.nextLine();
		n=str.length();
		char a[]=new char[n];
		char rev[]=new char[n];
		a=str.toCharArray();
		for(i=0;i<n;i++)
			rev[n-1-i]=a[i];
		for(i=0;i<n;i++)
		{
			if(rev[i]!=a[i])
			{
				break;
			}
		}	
		if(n==i)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		
	}

}
