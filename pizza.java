import java.util.*;


class menu
{
	long tt=0;
	void menu()
	{
		System.out.println("\n\t****Menu card of Pizza corner****");
		System.out.println("\t| 1.Pizza \t 2.Meal     | \n\t| 3.Drink \t 4.Pasta    |\n\t| 5.Sides \t 6.Desserts |\n\t| 7.Magic pan \t 8.Offer    |");
		System.out.println("\t Press 9 for checkout");
		System.out.print("\n\t Please enter your choice : ");
	}

	void menu1()
	{
		System.out.println("\n\t|  ****  Pizzas  ****    | Rs. |");
		System.out.println("\t| 1.Veggie Supreme       | 490 |");
		System.out.println("\t| 2.Exotica              | 490 |");
		System.out.println("\t| 3.Paneer Vegorama      | 490 |");
		System.out.println("\t| 4.Chicken Supreme      | 570 |");
		System.out.println("\t| 5.Triple Chicken Feast | 570 |");
		System.out.println("\t| 6.Chicken Italiano     | 570 |");
		System.out.println("\t| 7.Ultimate Chicken     | 570 |");
		System.out.println("\t| 8.Tandoori Paneer      | 460 |");
		System.out.print("\n\tChoose the option of pizza :");
	}

	void menu2()
	{
		System.out.println("\n\t|       ****  MEAL  ****       | Rs. |");
		System.out.println("\t| 1.Triple Treat Box Veg       | 410 |");
		System.out.println("\t| 2.Triple Treat Box Non-veg   | 400 |");
		System.out.println("\t| 3.Family Fun Meal For 2      | 390 |");
		System.out.println("\t| 4.Magic Pan Box of 4 Veg     | 350 |");
		System.out.println("\t| 5.Magic pan Box of 4 Non-veg | 400 |");
		System.out.print("\n\tChoose the option of meal :");
	}

	void menu3()
	{
		System.out.println("\n\t| ** DRINK ** | Rs. |");
		System.out.println("\t| 1.Red Bull  | 126 |");
		System.out.println("\t| 2.Frooti    |  61 |");
		System.out.println("\t| 3.Cafe Cuba |  52 |");
		System.out.println("\t| 4.Appy Edge |  34 |");
		System.out.println("\t| 5.7-UP      |  38 |");
		System.out.println("\t| 6.Mirinda   |  60 |");
		System.out.println("\t| 7.Pepsi     |  60 |");
		System.out.print("\n\tChoose the option of drink :");
	}

	void menu4()
	{
		System.out.println("\n\t|      **** PASTA ****           | Rs. | ");
		System.out.println("\t| 1.Spanish Tomato Veg Pasta     | 139 |");
		System.out.println("\t| 2.Spanish Tomato Non-Veg Pasta | 159 |");
		System.out.print("\n\tChoose the option of pasta :");
	}

	void menu5()
	{
		System.out.println("\n\t|   **** SIDES ****            | Rs. |");
		System.out.println("\t| 1.Spicy Baked Chicken Wings  | 169 |");
		System.out.println("\t| 2.Garlic Bread Exotica       | 139 |");
		System.out.println("\t| 3.Cheese Garlic Bread        | 109 |");
		System.out.println("\t| 4.Garlic Bread Spicy Supreme | 129 |");
		System.out.println("\t| 5.Garlic Bread               |  89 |");
		System.out.println("\t| 6.Stuffed Pocket Veg         |  79 |");
		System.out.println("\t| 7.Stuffed Pocket Non-veg     |  99 |");
		System.out.println("\t| 8.Texas Garlic Dip           |  25 |");
		System.out.print("\n\tChoose the option of sides :");
	}

	void menu6()
	{
		System.out.println("\n\t| **** Desserts ****   | Rs. |");
		System.out.println("\t| 1.Choco Mousse       |  79 |");
		System.out.println("\t| 2.Choco Truffle Cake |  79 |");
		System.out.print("\n\tChoose the option of Desserts :");
	}

	void menu7()
	{
		System.out.println("\n\t| **** Magic Pan ****    | Rs. |");
		System.out.println("\t| 1.Paneer & Capsicum    |  99 |");
		System.out.println("\t| 2.Chola & Onion        |  79 |");
		System.out.println("\t| 3.corn                 |  59 |");
		System.out.println("\t| 4.Onion                |  59 |");
		System.out.println("\t| 5.Chicken Keema & Corn | 109 |");
		System.out.print("\n\tChoose the option of Magic Pan :");
	}

	void menu8()
	{
		System.out.println("\n\t|         **** Offers ****                        | Rs. |");
		System.out.println("\t| 1.Pepsi + Tandoori Paneer Pizza + Choco mousse  | 550 |");
		System.out.println("\t| 2.Pepsi + Ultimate Chicken Pizza + Choco mousse | 680 |");
		System.out.print("\n\tChoose the option of offers :");
	}

	void rate1(int r1)
	{
		switch(r1)//pizza
		{
			case 1:
			case 2:
			case 3:
				tt=tt+490;
				break;
			case 4:
			case 5:	
			case 6:
			case 7:	
				tt=tt+570;
				break;
			case 8:
				tt=tt+460;
				break;
		}//end of switch r1
	}
	
	void rate2(int r2)
	{	
		switch(r2)//meal
		{
			case 1:
				tt=tt+410;
				break;
			case 2:
			case 5:
				tt=tt+400;
				break;
			case 3:
				tt=tt+390;
				break;
			case 4:	
				tt=tt+350;
				break;
		}//end of switch r2
	}

	void rate3(int r3)
	{		
		switch(r3)//drink
		{
			case 1:
				tt=tt+126;
				break;
			case 2:
				tt=tt+61;
				break;
			case 3:
				tt=tt+52;
				break;
			case 4:
				tt=tt+34;
				break;
			case 5:	
				tt=tt+38;
				break;
			case 6:	
			case 7:	
				tt=tt+60;
				break;		
		}//end of switch r3
	}

	void rate4(int r4)
	{	
		switch(r4)//pasta
		{
			case 1:
				tt=tt+139;
				break;
			case 2:
				tt=tt+159;
				break;	
		}//end of switch r4
	}

	void rate5(int r5)
	{	
		switch(r5)//sides
		{
			case 1:
				tt=tt+169;
				break;
			case 2:
				tt=tt+139;
				break;
			case 3:
				tt=tt+109;
				break;
			case 4:
				tt=tt+129;
				break;
			case 5:	
				tt=tt+89;
				break;
			case 6:	
				tt=tt+79;
			case 7:	
				tt=tt+99;
				break;		
			case 8:	
				tt=tt+25;
				break;		
		}//end of switch r5
	}

	void rate6(int r6)
	{		
		switch(r6)//desserts
		{
			case 1:
			case 2:
				tt=tt+79;
				break;
		}//end of switch r6
	}

	void rate7(int r7)
	{	
		switch(r7)//magic pan
		{
			case 1:
				tt=tt+99;
				break;
			case 2:
				tt=tt+79;
				break;
			case 3:
			case 4:
				tt=tt+59;
				break;
			case 5:	
				tt=tt+109;
				break;	
		}//end of switch r7
	}

	void rate8(int r8)
	{	
		switch(r8)//offer
		{
			case 1:
				tt=tt+550;
				break;
			case 2:
				tt=tt+680;
				break;		
		}//end of switch r8
	}

	long sum()
	{
		return tt;
	}
}

class pizza
{
	public static void main(String args[])
	{
		Scanner get = new Scanner(System.in);
		menu m = new menu();

		double total,gst,total_gst;;
		String name;
		Long pass;
		int x,m1=0,m2=0,m3=0,m4=0,m5=0,m6=0,m7=0,m8=0;
		System.out.println("\n\t\t ******** Pizza Corner ********");
		
		//get name
		System.out.print("Please enter your name : ");
		name=get.nextLine();

		//get login id
		System.out.print("Enter the 5 digit no login id : ");
		pass=get.nextLong();

		//check id
		if((pass.toString().length())!=5)//convert into string and count length
		{
			System.out.println("Login id is incorrect");
		}
		else
		{
			do
			{
				m.menu();	
				x=get.nextInt();

				switch(x)
				{
					case 1:
						m.menu1();//pizza
						m1=get.nextInt();
						if(!(m1>=1 && m1<=8))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate1(m1);
						}
						break;
					case 2:
						m.menu2();//meal
						m2=get.nextInt();
						if(!(m2>=1 && m2<=5))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate2(m2);
						}
						break;
					case 3:
						m.menu3();//drink
						m3=get.nextInt();
						if(!(m3>=1 && m3<=7))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate3(m3);
						}
						break;
					case 4:
						m.menu4();//pasta
						m4=get.nextInt();
						if(!(m4>=1 && m4<=2))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate4(m4);
						}
						break;	
					case 5:
						m.menu5();//sides
						m5=get.nextInt();
						if(!(m5>=1 && m5<=8))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate5(m5);
						}
						break;
					case 6:
						m.menu6();//desserts
						m6=get.nextInt();
						if(!(m6>=1 && m6<=2))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate6(m6);
						}
						break;
					case 7:
						m.menu7();//magic pan
						m7=get.nextInt();
						if(!(m7>=1 && m7<=5))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate7(m7);
						}
						break;
					case 8:
						m.menu8();///offer
						m8=get.nextInt();
						if(!(m8>=1 && m8<=2))
						{
							System.out.println("Invalid Option");
						}
						else
						{
							m.rate8(m8);
						}
						break;	
					case 9:
						break;	
					default:
						System.out.println("Invalid choose");
					break;					
				}//end of switch
			}while(x>0 && x<9);//end of do

			total=m.sum();
			gst=(total*9)/100;
			total_gst=total+(2*gst);
			if(total>0 && total<400)
			{
				System.out.println("Name : "+name);
				System.out.println("Total amount before GST : "+total);
				System.out.println("SGST : "+gst+"%" );
				System.out.println("CGST : "+gst+"%" );
				System.out.println("Total amount after GST : "+total_gst);
				total_gst=total_gst+100;
				System.out.println("Delivery Charges : 100");
				System.out.println("Final amount : "+total_gst);
			}
			else
			{
				System.out.println("Name : "+name);
				System.out.println("Total amount before GST : "+total);
				System.out.println("SGST : "+gst+"%" );
				System.out.println("CGST : "+gst+"%" );
				System.out.println("Final amount : "+total_gst);
			}
		}//end of if
	}//close main
}//close class