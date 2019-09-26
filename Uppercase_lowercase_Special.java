package session1;
import java.util.*;
public class Str 
{

	public static void main(String[] args) 
	{
		String str;
		int i,n;
		int u=0,l=0,sp=0,d=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.nextLine();
		n=str.length();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
			{
				u++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				l++;
			}
			else if(str.charAt(i)>='0'&& str.charAt(i)<='9')
			{
				d++;
			}
			else if(str.charAt(i)==' ')
			{
				b++;
			}
			else
			{
				sp++;
			}
		}
		
		System.out.println("No of Upper case "+u);
		System.out.println("No of lower case "+l);
		System.out.println("No of Digit "+d);
		System.out.println("No of Bracket "+b);
		System.out.println("No of Special "+sp);

	}

}
