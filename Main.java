package session1;


import java.util.*;

class Rational
{
	int nr,dr;
	Rational()
	{
		nr=0;
		dr=0;
	}
	
	Rational(int x,int y)
	{
		nr=x;
		dr=y;
	}
	
	Rational sum (Rational n)
	{
		int temp1=0,temp2=0;
		Rational r=new Rational();
		temp1=nr*n.dr;
		temp2=dr*n.nr;
		r.nr=temp1+temp2;
		r.dr=dr*n.dr;
		return r;
	}
	
	void display()
	{
		System.out.println(nr+"/"+dr);
	}
}


public class Main
{

	public static void main(String[] args) 
	{
		Rational r1=new Rational(2,5);
		Rational r2=new Rational(3,7);
		Rational r3=new Rational();
		
		r3=r1.sum(r2);
		r1.display();
		System.out.println("+");
		r2.display();
		System.out.println("=");
		r3.display();
		System.out.println();
		
	}

}
