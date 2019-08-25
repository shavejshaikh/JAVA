import java.util.*;
public class KBC1
{
	static Scanner sc = new Scanner(System.in);
	static char x;
	static int y;
	static String name;
	static Random r=new Random();
	static String s[]={"1 : Audience poll","2 :  50-50  ","3 : Phone-O-Friend","4 : Expert Adviser"};
	static int aud=0,dip=0,pho=0,exp=0;
	static boolean [] lifeline = new boolean[4];
	
	static void setLife()
	{
		for(int i=0; i<4; i++)
			lifeline[i] = true;
	}
	
	public static void main(String[] args)
	{
			System.out.println("\t\t\tWelcome to KAUN BANEGA CROREPATI\t\t\t");
			System.out.println("Enter your name:");
			name=sc.nextLine();
			setLife();
			play();
			
	}//End of class
			
			public static void play()
			{
				
				rule();
				
				q1();
				
				q2();
			
				q3();
				
				q4();
				
				q5();
			
				q6();
			
				q7();
				
				q8();
				
				q9();
			
				q10();
			
				q11();
			
				q12();
			
				q13();
				
				q14();
				
				q15();
			}//End of play
	
			public static void rule()
			{
				
				System.out.println("\nYou will get 15 Question and price of question on your Screen");
				System.out.println("\fFor 15 Question No lifeline is there");
				System.out.println("15 ***Rs 7,00,00,000***");
				System.out.println("14    Rs 5,00,00,000");
				System.out.println("13    Rs 3,00,00,000");
				System.out.println("12    Rs 1,00,00,000");
				System.out.println("11   ***Rs 50,00,000***");
				System.out.println("10      Rs 25,00,000");
				System.out.println("9       Rs 12,50,000");
				System.out.println("8        Rs 6,40,000");
				System.out.println("7     ***Rs 3,20,000***");
				System.out.println("6        Rs 1,60,000");
				System.out.println("5          Rs 80,000");
				System.out.println("4       ***Rs 40,000***");
				System.out.println("3          Rs 20,000");
				System.out.println("2          Rs 10,000");
				System.out.println("1           Rs 5,000");
				System.out.println("(*)Denote if you give wrong answer above (*) you will get (*) Rupees\n");
				System.out.print("\fIn addition to this, you'll have 4 lifelines to assist you\n\n");
			    System.out.print(s[0]+" : Will help you to take audience's opinion\n");
			    System.out.print(s[1]+" : Will allow you to give two answers for the same question\n");
			    System.out.print(s[2]+" : Will enable you to call your friend for the answer\n");
			    System.out.print(s[3]+" : Ask the experts for their advice\n");
			   	System.out.println();
			    
			}//End of rule
	
			public static void life()
			{
				System.out.println("Lifeline are:");
				if(lifeline[0])
					System.out.println("1.Audience poll");
				if(lifeline[1])
					System.out.print("\t2.50-50");
				if(lifeline[2])
					System.out.println("3.Phone-O-Friend");
				if(lifeline[3])
					System.out.print("\t4.Expert Adviser");
				System.out.println("Which Lifeline you want to use:");
				y=sc.nextInt();
			}//End of life 
			
			
			
			public static void life1()
			{
				life();
			
				switch(y)
				{
					case 1:
							System.out.println("a.65% \tb.15%\t c.15%\t d.5%");
							lifeline[0] = false;
							break;
					case 2:
							System.out.println("a.\tc.");
							lifeline[1] = false;
							break;
					case 3:
							System.out.println("a. is a correct answer");
							lifeline[2] = false;
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \na. is a correct answer");
							lifeline[3] = false;
							break;
					default:
							System.out.println("Wrong choice");
							break;
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'b':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 0 Rs");
						          System.exit(0);
						case 'a': System.out.println("Correct Answer");
								  System.out.println("You Won 5,000 Rs");	
					}
				
			}
				
				
			public static void life2()
			{
				life();
			
				
				switch(y)
				{
					case 1:
							System.out.println("a.5% \tb.15%\t c.10%\t d.70%");
							break;
					case 2:
							System.out.println("b \t d");
							break;
					case 3:
							System.out.println("d is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Salman Khan");
							System.out.println("She say: \nd is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'c': System.out.println("Wrong Answer");
								  System.out.println("You Won 0 Rs");
						          System.exit(0);
						          
						case 'd': System.out.println("Correct Answer");
								  System.out.println("You Won 10,000 Rs");	
					}
				
			}
			
			public static void life3()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.25% \tb.5%\t c.50%\t d.25%");
							break;
					case 2:
							System.out.println("a \tc ");
							break;
					case 3:
							System.out.println("c is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nc is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 0 Rs");
						          System.exit(0);
						case 'c': System.out.println("Correct Answer");
								  System.out.println("You Won 20,000 Rs");	
					}
				
			}
			
			public static void life4()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.5% \tb.15%\t c.65%\t d.15%");
							break;
					case 2:
							System.out.println("a.\tc.");
							break;
					case 3:
							System.out.println("c is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nc is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 0 Rs");
						          System.exit(0);
						case 'c': System.out.println("Correct answer");
								  System.out.println("You Won 40,000 Rs");	
					}
				
			}
			
			public static void life5()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.5% \tb.55%\t c.15%\t d.25%");
							break;
					case 2:
							System.out.println(" b \t d ");
							break;
					case 3:
							System.out.println("b is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nb is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 40,000 Rs");
						          System.exit(0);
						case 'b': System.out.println("Correct Answer");
								  System.out.println("You Won 80,000 Rs");	
					}
				
			}
			public static void life6()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a. 35% \tb. 55%\t c. 5%\t d. 5%");
							break;
					case 2:
							System.out.println(" a \t b ");
							break;
					case 3:
							System.out.println("b is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nb is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 40,000 Rs");
						          System.exit(0);
						case 'b': System.out.println("Correct Answer");
								  System.out.println("You Won 1,60,000 Rs");	
					}
				
			}
			
			public static void life7()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.1% \tb.55%\t c.9%\t d.35%");
							break;
					case 2:
							System.out.println(" b \t d ");
							break;
					case 3:
							System.out.println("b is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nb is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 40,000 Rs");
						          System.exit(0);
						case 'b': System.out.println("Correct Answer");
								  System.out.println("You Won 3,20,000 Rs");	
					}
				
			}
			
			public static void life8()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.12% \tb.28%\t c.59%\t d.1%");
							break;
					case 2:
							System.out.println(" b \t c ");
							break;
					case 3:
							System.out.println("c is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nc is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 3,20,000 Rs");
						          System.exit(0);
						case 'c': System.out.println("Correct Answer");
								  System.out.println("You Won 6,40,000 Rs");	
					}
				
			}
			
			public static void life9()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.65% \tb.15%\t c.15%\t d.5%");
							break;
					case 2:
							System.out.println("a \t c ");
							break;
					case 3:
							System.out.println("a is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \na is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'b':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 3,20,000 Rs");
						          System.exit(0);
						case 'a': System.out.println("Correct Answer");
								  System.out.println("You Won 12,50,000 Rs");	
					}
				
			}
			
			public static void life10()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.15% \tb.15%\t c.65%\t d.5%");
							break;
					case 2:
							System.out.println("a.\t c.");
							break;
					case 3:
							System.out.println("c is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nc is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 3,20,000 Rs");
						          System.exit(0);
						case 'c': System.out.println("Correct Answer");
								  System.out.println("You Won 25,00,000 Rs");	
					}
				
			}
			
			public static void life11()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.32% \tb.3%\t c.58%\t d.7%");
							break;
					case 2:
							System.out.println(" b \t c ");
							break;
					case 3:
							System.out.println("c is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nc is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 3,20,000 Rs");
						          System.exit(0);
						case 'c': System.out.println("Correct Answer");
								  System.out.println("You Won 50,00,000 Rs");	
					}
				
			}
			
			public static void life12()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.26% \tb.8%\t c.64%\t d.2%");
							break;
					case 2:
							System.out.println(" a \t c ");
							break;
					case 3:
							System.out.println("c is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nc is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'b':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 50,00,00 Rs");
						          System.exit(0);
						case 'c': System.out.println("Correct Answer");
								  System.out.println("You Won 1 crore Rs");	
					}
				
			}
			
			public static void life13()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.15% \tb.70%\t c.5%\t d.10%");
							break;
					case 2:
							System.out.println(" a \t b");
							break;
					case 3:
							System.out.println("b is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nb is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 50,00,000 Rs");
						          System.exit(0);
						case 'b': System.out.println("Correct Answer");
								  System.out.println("You Won 3 crore Rs");	
					}
				
			}
			
			public static void life14()
			{
				life();
				
				switch(y)
				{
					case 1:
							System.out.println("a.2% \tb.75%\t c.15%\t d.8%");
							break;
					case 2:
							System.out.println(" b \t c");
							break;
					case 3:
							System.out.println("b is a correct answer");
							break;
					case 4:
							System.out.println("Today expert adviser is Rakhi Sawant");
							System.out.println("She say: \nb is a correct answer");
					
				}
				
					System.out.println("Enter your option");
					x = sc.next().charAt(0);
					switch(x)
					{
						case 'a':
						case 'c':
						case 'd': System.out.println("Wrong Answer");
								  System.out.println("You Won 50,00,000 Rs");
						          System.exit(0);
						case 'b': System.out.println("Correct Answer");
								  System.out.println("You Won 5 crore Rs");	
					}
				
			}
			
			
			
			public static void cheque1()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 0/-                                   |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Zero Only                             |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
	
			public static void cheque2()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );                                   
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 40,000/-                              |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Fourty Thousand Only                  |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
	
			public static void cheque3()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 3,20,000/-                            |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Three Lakh Twenty Thousand Only       |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
	
	
			public static void cheque4()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 50,00,000                             |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Fifty Lakh Only                       |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
	
			public static void cheque5()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 7,00,00,000                           |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : 7 Crore Only                          |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			
			public static void cheque6()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 5,00,00,000/-                         |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Five Crore Only                       |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque7()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 3,00,00,000/-                         |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Three Crore Only                      |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque8()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 1,00,00,000/-                         |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : One Crore Only                        |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque9()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 25,00,000/-                           |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Twenty Five Lakh Only                 |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque10()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 12,50,000/-                           |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Twelve Lakh Fifty Thousand Only       |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque11()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 6,40,000/-                            |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Six Lakh Fourty Thousand Only         |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque12()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 1,60,000/-                            |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : One Lakh Sixty Thousand Only          |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque13()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 80,000/-                              |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Eighty Thousand Only                  |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque14()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 20,000/-                              |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Twenty Thousand Only                  |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			
			public static void cheque15()
			{
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 10,000/-                              |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Ten Thousand Only                     |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void cheque16()
			{	
				System.out.println("___________________________________________________________");
				System.out.println("|                 STATE BANK OF INDIA                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                                         |");
				System.out.println("| NAME: "+name                                              );
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN NUMBER: 5,000/-                               |");
				System.out.println("|                                                         |");
				System.out.println("| AMOUNT IN WORD  : Five Thousand Only                    |");
				System.out.println("|                                                         |");
				System.out.println("| ACCOUNT NUMBER  : 121 4514 1457 123                     |");
				System.out.println("|                                                         |");
				System.out.println("|                                           AMIT          |");
				System.out.println("|                                         SIGNATURE       |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void again()
			{
				  System.out.println("Do you want to play again:");
				  System.out.println("If YES Press 'Y' && For NO Press 'N'");
				  x=sc.next().charAt(0);
				  if(x== 'y'|| x== 'Y')
				  {
					play();	 
				  }
				  else if(x=='n'|| x=='N')
				  {  
				   System.out.print("\n THANK YOU FOR PLAYING KBC");
				   System.exit(0);
				  }
			}
			
			
			public static void q1()
			{	    System.out.println("______________________________________");
					System.out.println("|                                    |");
					System.out.println("|Here the 1 Question for Rs 5000     |");
					System.out.println("|How many hours are there in a day?  |");
					System.out.println("|____________________________________|");
					System.out.println("a. 24 \t b. 18 \nc. 30 \t d. 12");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 System.out.print("\nTHANK YOU FOR PLAYING KBC");
						 System.exit(0);
					}
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use LifeLine y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life1();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'b':
							case 'c':
							case 'd': System.out.println("Wrong Answer");
									  cheque1();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
									  
							case 'a': System.out.println("Correct Answer");
									  System.out.println("You Won 5,000 Rs");
					
							
							}//End of switch
						}//End of if
					}//End of else
			}//End of q1
			
			public static void q2()
			{		System.out.println("___________________________________________________________________________");
					System.out.println("|                                                                         |");
					System.out.println("|Here the 2 Question for Rs 10,000					  |");
					System.out.println("|Australian Mary Donaldson married into the royal family of which country?|");
					System.out.println("|_________________________________________________________________________|");
					System.out.println("a. Italy \t b. New Zealand \t  c.Mexico \t d. Denmark");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque16();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life2();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}
						
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'c': System.out.println("Wrong Answer");
									  cheque1();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							  		  
							case 'd': System.out.println("Correct answer");
									  System.out.println("You Won 10,000 Rs");
						
							  		  	
							}//End of switch
						}//End of if
					}//End of else
				}//End of q2
			
			public static void q3()
			{		System.out.println("________________________________________________________________________");
					System.out.println("|                                               	               |");
					System.out.println("|				Here the 3 Question for Rs 20 Thousand |");
					System.out.println("|Who co-founded Hotmail in 1996 and then sold the company to Microsoft?|");
					System.out.println("|______________________________________________________________________|");
					System.out.println("a. Shawn Fanning \t b. Ada Byron Lovelace \t  c. Sabeer Bhatia  \t d. Ray Tomlinson");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque15();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life3();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'd': System.out.println("Wrong Answer");
									  cheque1();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							          
							case 'c': System.out.println("Correct Answer");
									  System.out.println("You Won 20,000 Rs");
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q3
			
			public static void q4()
			{		System.out.println("_____________________________________________________");
					System.out.println("|                                         	    |");
					System.out.println("|	Here the 4 Question of Rs 40 Thousand       |");
					System.out.println("| Arctic regions are home to which of these animals?|");
					System.out.println("|___________________________________________________|");
					System.out.println("a.Mountain lion \t b. Indian elephant \t  c. Polar bear \t d.Bengal tiger");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque14();
						 System.exit(0);
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life4();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'd': System.out.println("Wrong Answer");
									  cheque1();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							          
							case 'c': System.out.println("Correct Answer");
							          System.out.println("You Won 40,000 Rs");
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q4
			
			public static void q5()
			{		System.out.println("___________________________________________");
					System.out.println("|                                         |");
					System.out.println("|     Here the 5 Question of Rs 80,000    |");
					System.out.println("|  Which Indian State has most airport?   |");
					System.out.println("|_________________________________________|");
					System.out.println("a. Kerala \t b. Gujarat \t  c. Maharashtra \t d. Madhya pradesh");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque2();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						if(x== 'y'|| x== 'Y')
						{
							life5();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'd':
							case 'c': System.out.println("Wrong Answer");
									  System.out.println("You Won 40,000 Rs");
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'b': System.out.println("Correct Answer");
							 		  System.out.println("You Won 80,000 Rs");
				
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q5
			
			public static void q6()
			{		System.out.println("_______________________________________________________");
					System.out.println("|                                                     |");
					System.out.println("|         Here the 6 Question of Rs 1,60,000          |");
					System.out.println("|Which is a child's toy that has a puppet on a spring?|");
					System.out.println("|_____________________________________________________|");
					System.out.println("a. Jackhammer \t b. Jack-in-the-box \t  c. Jackboot \t d. Jack-o'-lantern");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque13();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						if(x== 'y'|| x== 'Y')
						{
							life6();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'd':
							case 'c': System.out.println("Wrong Answer");
									  System.out.println("You Won 40,000 Rs");
									  cheque2();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'b': System.out.println("Correct Answer");
							 		  System.out.println("You Won 1,60,000 Rs");
				
							        
							}//End of switch
						}//End of if
					}//End of else
				}//End of q6
			
			public static void q7()
			{		System.out.println("___________________________________________");
					System.out.println("|                                         |");
					System.out.println("|    Here the 7 Question of Rs 3,20,000   |");
					System.out.println("|  Which of these is an Australian state? |");
					System.out.println("|_________________________________________|");
					System.out.println("a. North Australian  \t b. South Australian  \t  c. East Australian  \t d. West Australian ");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque12();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life7();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'd':
							case 'c': System.out.println("Wrong Answer");
									  System.out.println("You Won 40,000 Rs");
									  cheque2();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'b': System.out.println("Correct Answer");
							 		  System.out.println("You Won 3,20,000 Rs");
			
							        
							}//End of switch
						}//End of if
					}//End of else
				}//End of q7
			
			public static void q8()
			{		System.out.println("___________________________________________");
					System.out.println("|                                         |");
					System.out.println("|    Here the 8 Question of Rs 6,50,000   |");
					System.out.println("| Who was the Lead actor of sultan movie ?|");
					System.out.println("|_________________________________________|");
					System.out.println("a.Amir khan\tb.Shahrukh khan\tc.Salman khan\td.Farhan Akhtar");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque3();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life8();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'd': System.out.println("Wrong Answer");
									  System.out.println("You Won 3,20,000 Rs");
									  cheque3();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'c': System.out.println("Correct Answer");
							 		  System.out.println("You Won 6,40,000 Rs");
		
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q8
			
			public static void q9()
			{		System.out.println("______________________________________________");
					System.out.println("|                                            |");
					System.out.println("|     Here the 9 Question of Rs 12,50,000    |");
					System.out.println("| 'DTP' computer abbreviation usually means? |");
					System.out.println("|____________________________________________|");
					System.out.println("a. DeskTop Publishing \t b. Data Type Programming \t  c. Digital Transmission Protocol \t d. Document Type Processing");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque11();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{	
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life9();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'd':
							case 'b':
							case 'c': System.out.println("Wrong Answer");
							          cheque3();
							          again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'a': System.out.println("Correct Answer");
							 		  System.out.println("You Won 12,50,000 Rs");
			
							          	
							}//End of switch
						}//End of if
					}//End of else
				}//End of q9
			
			public static void q10()
			{		System.out.println("___________________________________________");
					System.out.println("|                                         |");
					System.out.println("|   Here the 10 Question for Rs 25 Lakh   |");
					System.out.println("|       How State does India have?        |");
					System.out.println("|_________________________________________|");
					System.out.println("a. 26 \t b. 28 \t  c. 29 \t d. 32");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque10();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						
						if(x== 'y'|| x== 'Y')
						{
							life10();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'd': System.out.println("Wrong Answer");
							 		  cheque3();
							 		 again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'c': System.out.println("Correct Answer");
									  System.out.println("You Won 25,00,000 Rs");
			
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q10
			
			public static void q11()
			{	    System.out.println("___________________________________________");
					System.out.println("|                                         |");	
					System.out.println("|   Here the 11 Question for Rs 50 Lakh   |");
					System.out.println("|   What is the Parsi New Year known as?  |");
					System.out.println("|_________________________________________|");
					System.out.println("a. Hina Masturi \t b. Rosh Hasana \t  c. Navroz \t d. Passover");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque9();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						if(x== 'y'|| x== 'Y')
						{
							life11();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'd': System.out.println("Wrong Answer");
							          cheque3();
							          again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'c': System.out.println("Correct Answer");
							 		  System.out.println("You Won 50,00,000 Rs");
							
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q11
			
			public static void q12()
			{		System.out.println("___________________________________________");
					System.out.println("|                                         |");
					System.out.println("|    Here the 12 Question of Rs 1 crore   |");
					System.out.println("|       How many bits is a byte?          |");
					System.out.println("|_________________________________________|");
					System.out.println("a. 32 \t b. 4 \t  c. 8 \t d. 16");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque4();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						if(x== 'y'|| x== 'Y')
						{
							life12();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'b':
							case 'd': System.out.println("Wrong Answer");
									  cheque4();
									  again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'c': System.out.println("Correct Answer");
							 		  System.out.println("You Won 1 crore Rs");
				
							          	  
							}//End of switch
						}//End of if
					}//End of else
				}//End of q12
			
			public static void q13()
			{		System.out.println("_______________________________________________");
					System.out.println("|                                             |");	
					System.out.println("|    Here the 13 Question for Rs 3 Crore      |");
					System.out.println("|What kind of geographical feature is Everest?|");
					System.out.println("|_____________________________________________|");
					System.out.println("a. Desert \t b. Mountain \t  c. River \t d. Sea");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque8();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						if(x== 'y'|| x== 'Y')
						{
							life13();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'd':
							case 'c': System.out.println("Wrong Answer");
							          cheque4();
							          again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'b': System.out.println("Correct Answer");
							          System.out.println("You Won 3 crore Rs");	
					
							          
							          
							}//End of switch
						}//End of if
					}//End of else
				}//End of q13
			
			public static void q14()
			{		System.out.println("_____________________________________________________________");
					System.out.println("|                                                           |");
					System.out.println("|          Here the 14 Question for Rs 5 Crore              |");
					System.out.println("|Kuchipudi' is a dance associated with which state of India?|");
					System.out.println("|___________________________________________________________|");
					System.out.println("a. Rajasthan \t b. Andhra Pradesh \t  c. Madhya Pradesh \t d. Odisha");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque7();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{
						System.out.println("Do you wish to use Life Line y/n");		
						x = sc.next().charAt(0);
						if(x== 'y'|| x== 'Y')
						{
							life14();
						}
						
						else if (x!='n'&& x!='y')
						{
							System.out.println("!!Thank You!!");
							System.exit(0);
						}//end of else if 
						
						else if(x == 'n' || x == 'N')
						{
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
							case 'a':
							case 'd':
							case 'c': System.out.println("Wrong Answer");
							 		  cheque4();
							 		 again();
									  
							default:  System.out.println("Invalid Option");
									  System.out.println("!!Thank You!!");
							  		  System.exit(0);  
							case 'b': System.out.println("Correct Answer");
							 		  System.out.println("You Won 5 crore Rs");
				
							        
							}//End of switch
						}//End of if
					}//End of else
				}//End of q14
			
			public static void q15()
			{		System.out.println("___________________________________________");
					System.out.println("|                                         |");
					System.out.println("|Here the Jackpot  Question for Rs 7 crore|");
					System.out.println("|Which of these is a smooth,glossy fabric?|");
					System.out.println("|_________________________________________|");
					System.out.println("a. Denim\tb.Canvas\tc. Satin\t d. linen");
					System.out.println("Do you Want to Quit the Games y/n");
					x=sc.next().charAt(0);
					if(x== 'y'|| x== 'Y')
					{
						 cheque6();
						 System.exit(0);
						
					}
					
					else if (x!='n'&& x!='y')
					{	
						System.out.println("Wrong choice");
						System.out.println("!!Thank You!!");
						System.exit(0);
					}
					
					else
					{		System.out.println("\t***No lifeline****");
							System.out.println("Enter your option");
							x = sc.next().charAt(0);
							switch(x)
							{
								case 'a':
								case 'b':
								case 'd': System.out.println("Wrong Answer");
										  cheque4();
										  again();
										  
								default:  System.out.println("Invalid Option");
										  System.out.println("!!Thank You!!");
								  		  System.exit(0);  
								case 'c': System.out.println("Correct Answer");
										  cheque5();
										  
							}//End of switch
					}//End of else
			}//End of q15
}//End of class
