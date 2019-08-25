package guessinggames;

import java.util.Scanner;
import java.util.Random;

	public class Guessinggames
	{
		 public static void main(String[] args)
		   {
		        int x,y,i;
		        Scanner sc=new Scanner(System.in);
		        Random r=new Random();
		        x=r.nextInt(50);
		        
		       
		        for(i=1;i<=7;i++)
		        {
		            System.out.println("Enter the number");
		            y=sc.nextInt();
		           
		            if(y==x)
		            {
		                System.out.println("You Win");
		                if(i==1)
		                    System.out.println("Your Point is 100");
		                else if(i==2)
		                    System.out.println("Your Point is 90");
		                else if (i==3)
		                    System.out.println("Your Point is 80");
		                else if(i==4)
		                    System.out.println("Your Point is 70");
		                else if(i==5)
		                    System.out.println("Your Point is 60");
		                else if(i==6)
		                    System.out.println("Your Point is 50");
		                else if(i==7)
		                    System.out.println("Your Point is 40");
		                break;
		            }
		            else if(y>x)
		            {
		                if((y-x)<10)
		                System.out.println("High but close");
		                else
		                    System.out.println("Too high");
		            }
		            else
		            {
		                if((y-x)<10)
		                System.out.println("low but close");
		                else
		                    System.out.println("Too low");
		            }
		           
		        }
		       
		        if(i==8)
		        {
		            System.out.println("You lost");
		            System.out.println("The correct answer is "+x);
		            System.out.println("Your Point is 00");
		        }
		       
		       
		    }

		}
	