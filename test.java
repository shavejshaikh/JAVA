/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class test extends JFrame implements ActionListener {
    JPanel jp;
    JLabel lbltitle;
    JRadioButton b1,b2,b3;
    JComboBox pref1,pref2;
    JCheckBox opt1,opt2,opt3,opt4,opt5;
    JButton done;
    Container c;
    String s;
    ButtonGroup bg;
    Vector selection;
    test()
    {
        jp=new JPanel();
        jp.setBounds(20,10,750,550);
        jp.setLayout(null);
        
        lbltitle=new JLabel(" Enter Details");
        lbltitle.setForeground(java.awt.Color.RED);
        lbltitle.setBounds(10,10,700,10);
        jp.add(lbltitle);
        
        
        JLabel lbltype = new JLabel("Enter Full Name");
        lbltype.setForeground(java.awt.Color.BLUE);
        lbltype.setBounds(20,17,175,100);
        jp.add(lbltype);
        
        JTextField txtid=new JTextField(30);
        txtid.setBounds(200,50,200,30);
        jp.add(txtid);
        
        
        JLabel lblsource = new JLabel("SELECT SOURCE STATION");
        lblsource.setForeground(java.awt.Color.BLUE);
        lblsource.setBounds(20,70,175,100);
        jp.add(lblsource);
        JLabel lbldestn=new JLabel("SELECT DESTINATION");
        lbldestn.setForeground(Color.BLUE);
        lbldestn.setBounds(20,130,175,100);
        jp.add(lbldestn);
        
        JLabel lblclass = new JLabel("Please Enter Ticket Type");
        lblclass.setForeground(Color.BLUE);
        lblclass.setBounds(20,200,175,100);
        jp.add(lblclass);
        
        b1 =new JRadioButton("AC-First Class");
        b2=new JRadioButton("CC-Chair Car");
        b3=new JRadioButton("Desi RoofTop");
        bg=new ButtonGroup();
        
        b1.setBounds(200,250,100,30);
        b2.setBounds(300,250,100,30);
        b3.setBounds(400,250,100,30);
     
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        
        String[] opt={"MUMBAI","CHENNAI","DELHI","KOLKATA"};
        pref1=new JComboBox(opt);
        pref1.setBounds(200,110,175,30);
        pref1.setBackground(Color.WHITE);
        jp.add(pref1);
        
        String[] opt1={"MUMBAI","CHENNAI","DELHI","KOLKATA"};
        pref2=new JComboBox(opt1);
        pref2.setBounds(200,160,175,30);
        pref2.setBackground(Color.WHITE);
        jp.add(pref2);
       done=new JButton("BOOK MY TICKET");
       done.setBounds(200,400,300,50);
       jp.add(done);
       
       
       setLayout(null);
       add(jp);
       setSize(800,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       c=getContentPane();
       c.setBackground(Color.LIGHT_GRAY);
       jp.setBackground(Color.WHITE);
       setTitle("BOOK A TICKET");
       setVisible(true);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       pref1.addActionListener(this);
       pref2.addActionListener(this);
       done.addActionListener(this);
    
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
