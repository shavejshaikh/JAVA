package KBC;
import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws Exception
	{
		int ch=0,a,b,c,c1;
		Socket s = new Socket("localhost",1024);
		BufferedReader br = new BufferedReader(new

		InputStreamReader(System.in));
		PrintStream ps=new PrintStream(s.getOutputStream());
		System.out.println("Please Enter Number 1:");
		a = Integer.parseInt(br.readLine());
		System.out.println("Please Enter Number 2:");
		b = Integer.parseInt(br.readLine());
		System.out.println("Please Enter The Operation to Be Performed\n");

		System.out.println("1.Addition 2.Subtraction 3.Multiplication\n 4.Divison 5.Modulo 6.Even and Odd 7.Armstrong 0.Exit"); 
		ch =Integer.parseInt(br.readLine());

		ps.println(ch);
		ps.println(a);
		ps.println(b);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		c=Integer.parseInt(br1.readLine());
		c1=Integer.parseInt(br1.readLine());
		
		
		if(ch==6)
		{
			System.out.println("Answer: "+c);
			if(c==1)
			{
				System.out.println(a+" even number");
			}
			else
			{
				System.out.println(a+ " odd number");
				
			}
		}
	
		if(ch==7)
		{	
				System.out.println("Answer: "+c1);
				if(c1==a)
				{
					System.out.println(a+" armstrong number");
				}
				else
				{
					System.out.println(a+ " not a armstrong number");	
				}
		}
		s.close();
		}
}

	
	

	


