package travel;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;    


public class travel extends JFrame 
{  
	
	
	public static void register()
	{
		JFrame f=new JFrame("Shavej Tour and Travel");  
	    JLabel l1,l2,l3; 
	    JButton b,b1;
	    l1=new JLabel("SHAVEJ TOUR AND TRAVELS");//heading
	    l1.setBounds(600,0,750,50);  
	    
	    l2=new JLabel("Username:");  
	    l2.setBounds(500,50,550,60);  
	    f.add(l2);
	    l3=new JLabel("Password:");  
	    l3.setBounds(500,100,550,30);
	    f.add(l3);
	    
	    JTextField t1,t2;  
	    t1=new JTextField(); 
	    
	    t1.setBounds(570,70,300,25);  
	    t2=new JTextField();  
	    t2.setBounds(570,100,300,25);  
	    f.add(t1); f.add(t2);  
	    
	    b1=new JButton("Exit");  //Exit Travelling page
	    b1.setBounds(600,150,95,30);  
	    
	    b=new JButton("Sign In");  //Open Travelling page
	    b.setBounds(680,150,100,30); 
	   
	    f.add(b);
	    f.add(b1);
	    f.add(l1);
	    f.setSize(1370,900);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	 
	    //exit
	    b1.addActionListener(new ActionListener()
	    {
			public void actionPerformed(ActionEvent b1)
			{  
					   System.exit(0);
			}
		});
	    
	    
	    //Ticket open
	    b.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent b)
	    	{
	    		if((t1.getText().equals("")) || (t2.getText().equals("")))
	    		{
	    			
	    			JOptionPane.showMessageDialog(null, "Enter the username and password");
	    	       
	    		}
	  
	    		else 
	    		{
	    			JOptionPane.showMessageDialog(null, "Welcome");
		    		choice();
		    		
	    		}
	    	}
	    });
	}
	
	public static void choice()
	{
		  
	        Frame c= new Frame("Choice"); 
	        c.setBackground(Color.gray);
	        Panel panel1=new Panel();  
	        panel1.setBounds(200,100,100,30);   
	        
	         
	        Button b1=new Button("BOOK A TICKET");     
	        b1.setBounds(50,60,100,20);    
	        b1.setBackground(Color.yellow); 
	        
	        Panel panel2=new Panel();  
	        panel2.setBounds(200,200,100,50); 
	        
	        Button b2=new Button("SHOW TICKET");   
	        b2.setBounds(50,60,80,20);    
	        b2.setBackground(Color.green);  
	        
	        Panel panel3=new Panel();  
	        panel3.setBounds(200,300,100,50); 
	        Button b3=new Button("CANCEL TICKET");   
	        b3.setBounds(60,80,80,20);    
	        b3.setBackground(Color.green); 
	        
	        
	        Panel panel4=new Panel();  
	        panel4.setBounds(200,400,100,50); 
	        Button b4=new Button("EXIT");   
	        b4.setBounds(60,90,80,20);    
	        b4.setBackground(Color.yellow);   
	       
	        panel1.add(b1); 
	        panel2.add(b2); 
	        panel3.add(b3); 
	        panel4.add(b4); 
	        c.add(panel1); 
	        c.add(panel2);
	        c.add(panel3);
	        c.add(panel4);
	        
	        b1.addActionListener(new ActionListener()
		    {
		    	public void actionPerformed(ActionEvent b)
		    	{
		    		book();
		    	}
		    	
		    });
	        
	        b2.addActionListener(new ActionListener()
		    {
		    	public void actionPerformed(ActionEvent b)
		    	{
		    		System.exit(0);
		    	}
		    	
		    });
	        
	        b3.addActionListener(new ActionListener()
		    {
		    	public void actionPerformed(ActionEvent b)
		    	{
		    		System.exit(0);
		    	}
		    	
		    });
	        
	        
	        
	        
	        
	        
	        
	        b4.addActionListener(new ActionListener()
		    {
		    	public void actionPerformed(ActionEvent b)
		    	{
		    		System.exit(0);
		    	}
		    	
		    });
	        
	        c.setSize(700,600);    
	        c.setLayout(null);    
	        c.setVisible(true);    
	        
	       
	  
	}

	//public static void show()
	//{
	
	//}
	
	//public static void cancel()
	//{
		
	//}
	
//book the ticket	
	public static void book()
	{
		JFrame t=new JFrame("Shavej Tour and Travel"); 
		JLabel l1,l2,l4,l5,l6,l7; 
		JTextField t4,t5,t6,t7;   
		JButton b1,b3;
		
		
		l1=new JLabel("TICKET BOOKING");//heading
	    l1.setBounds(600,0,750,50);  
	    
	    //Confirm button
		b1=new JButton("Confirm");  //Travelling page
	    b1.setBounds(500,500,80,50);
	    t.add(b1);
		//Cancel
        b3=new JButton("Cancel");  //Travelling page
	    b3.setBounds(700,500,75,50);
	    t.add(b3);
	   
	    l2=new JLabel("***INFORMATION***");//heading
	    l2.setBounds(0,30,120,50);
	    t.add(l2);
	    
	    //left hand
	    l4=new JLabel("First Name:");  //first name
	    l4.setBounds(0,50,550,60);  
	    t4=new JTextField();  
	    t4.setBounds(70,70,110,25);  
	    t.add(l4);
	    t.add(t4);
	    
	    
	    l5=new JLabel("Last Name:");  //last name
	    l5.setBounds(0,90,550,60);
	    t5=new JTextField();  
	    t5.setBounds(70,110,110,25);  
	    t.add(l5);
	    t.add(t5);
	    
	    
	    l6=new JLabel("Contact No:");  //contact no
	    l6.setBounds(0,150,550,30);
	    t6=new JTextField();  
	    t6.setBounds(70,150,110,25);
	    t.add(l6);
	    t.add(t6);
	    
	    l7=new JLabel("Age:");  //age 
	    l7.setBounds(35,190,550,30);
	    t7=new JTextField();  
	    t7.setBounds(70,190,110,25);
	    
	    t.add(l7);
	    t.add(t7);
	    
	    l7=new JLabel("Gender:");  //gender
	    l7.setBounds(15,230,50,30);
	    t.add(l7);
	    
	    JRadioButton r1=new JRadioButton("i.   Male");    
	    JRadioButton r2=new JRadioButton("ii.  Female");    
	   
	    
	    r1.setBounds(75,230,100,30);    
	    r2.setBounds(75,250,100,30);    
	    
	    
	    ButtonGroup bg=new ButtonGroup();    
	    bg.add(r1);
	    bg.add(r2);   
	
	    
	    t.add(r1);
	    t.add(r2);
	        
//right hand booking
//setbo(x,y,w,h)	    
	    JLabel l8,l9,l10,l11,l12;

	    l8=new JLabel("***TICKET***");//heading
	    l8.setBounds(1100,30,70,40);
	    t.add(l8);
	    
	    l9=new JLabel("From:");//heading
	    l9.setBounds(1025,60,70,50);
	    t.add(l9);
	    
	  
        List li1=new List(5);  
        li1.setBounds(1100,70,75,75);  
        li1.add("Mumbai");  
        li1.add("Pune");  
        li1.add("Delhi");  
        li1.add("Agra");  
        li1.add("Ooty");  
        li1.add("Ajmer");  
        li1.add("Hyderabad");  
        t.add(li1);
	    
	    
	    l10=new JLabel("To:"); //heading
	    l10.setBounds(1038,160,50,20);
	    t.add(l10);
	    
	    List li2=new List(5);  
        li2.setBounds(1100,160,75,75);  
        li2.add("Mumbai");  
        li2.add("Pune");  
        li2.add("Delhi");  
        li2.add("Agra");  
        li2.add("Ooty");  
        li2.add("Ajmer");  
        li2.add("Hyderabad");  
        t.add(li2);
	    
	    l11=new JLabel("Conditioner:");
	    l11.setBounds(990,250,70,50);
	    t.add(l11);
	    
	    JRadioButton ra1=new JRadioButton("i.   A/C");    
	    JRadioButton ra2=new JRadioButton("ii.  Non-A/C");    
	   
	    
	    ra1.setBounds(1100,260,100,30);    
	    ra2.setBounds(1100,280,100,30);    
	    
	    
	    ButtonGroup bag=new ButtonGroup();    
	    bag.add(ra1);
	    bag.add(ra2);   
	
	    
	    t.add(ra1);
	    t.add(ra2);
        
        
	    l12=new JLabel("Seat:");
	    l12.setBounds(1030,320,70,50);
	    t.add(l12);
	    
	    JRadioButton rb1=new JRadioButton("i.   Sleeper");    
	    JRadioButton rb2=new JRadioButton("ii.  Non-Sleeper");    
	   
	    
	    rb1.setBounds(1100,330,100,30);    
	    rb2.setBounds(1100,350,120,30);    
	    
	    
	    ButtonGroup bbg=new ButtonGroup();    
	    bbg.add(rb1);
	    bbg.add(rb2);   
	    t.add(rb1);
	    t.add(rb2);
       
       
	    
	    
	    t.add(l1);//frame
	    t.setSize(1370,900);  
	    t.setLayout(null);  
	    t.setVisible(true);   
	}
	
	
	public static void main(String[] args)
	{  
	    register();   
	}//second last
  
}//last
