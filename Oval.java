package session1;
import java.awt.*;
import java.applet.*;

public class Oval extends Applet
{
	public void paint (Graphics g)
	{
		Color Red=new Color(250,250,0);
		Color Yellow=new Color(250,0,0);
		Color Blue=new Color(0,0,250);
		
		g.setColor(Blue);
		g.fillOval(50, 50, 50, 60);
		g.setColor(Yellow);
		g.fillOval(150, 50, 50, 60);
		g.setColor(Red);
		g.fillOval(100, 50, 50, 60);
	}
	
}
