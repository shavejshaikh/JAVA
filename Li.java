package session1;
import java.awt.*;
import java.applet.*;

public class Li extends Applet
{

	public void paint(Graphics g)
	{	
		
		Color Red=new Color(0,0,250);
		g.setColor(Red);
		g.drawRoundRect(20,20,40,20,10,10);
		g.fillRect(20,20,40,20);
		
	}
}
