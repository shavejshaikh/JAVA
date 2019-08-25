package session1;

import java.awt.*;
import java.applet.*;

public class Triangle extends Applet
{
	int x[]={10,40,70};
	int y[]={20,10,20};
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,3);
	}
}