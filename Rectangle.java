import java.awt.*;
import java.applet.*;

public class Rectangle extends Applet
{
	public void paint(Graphics g)
	{
		Color red=new Color(250,0,0);
		Color blue=new Color(0,250,0);
		g.drawRect(10,10,50,10);
		g.fillRect(10,10,50,10);
		g.drawRoundRect(205,205,50,25,10,10);
		g.fillRoundRect(205,205,50,25,10,10);
		g.drawRect(10,30,50,10);
		g.drawRoundRect(105,105,50,25,10,10);
	}
}
