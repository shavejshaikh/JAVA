package session1;
import java.awt.*;
import java.applet.*;

public class Hello extends Applet
{	Font f=new Font("Times New Roman",Font.PLAIN,20);

	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString("HELLO JAVA",20,20);
	}
}
