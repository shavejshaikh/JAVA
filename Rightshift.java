import java.util.Scanner;

class Right
{
	long bin (int num)
	{
		int rem,i=1;
		long rev=0;
		while(num>0)
		{	
			rem=num%2;
			rev=rev+rem*i;
			num=num/2;
			i=i*10;
		}
		return (rev);
	}
}

public class Rightshift 
{

	public static void main(String[] args)
	{
		long ans;
		Right r=new Right();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the number shift:");
		int sh=sc.nextInt();
		int tt=n>>>sh;
		
		System.out.println(n);
		System.out.println("Into Binary");
		System.out.println(r.bin(n));
		System.out.println();
		System.out.println(tt);
		System.out.println("Into Binary");
		System.out.println(r.bin(tt));

	}

}
