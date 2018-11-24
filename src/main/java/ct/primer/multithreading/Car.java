package ct.primer.multithreading;
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class Car extends Thread
{
	Applet father;
	Rectangle2D.Double body;
	Ellipse2D.Double frontTire, rearTire;
	int speed;
	
	public Car(Applet frm,  double x, double y, int spd)
	{
		father = frm;
		xLeft = x;
		yTop = y;
		speed = spd;
	}


	public void run()
	{
		for(;;) {
			body   = new Rectangle2D.Double(xLeft, yTop + 10, 60, 10);	  
			frontTire= new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
			rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
			
			father.repaint();
			try {
				Thread.sleep(100);
				xLeft +=speed;
			}
			catch(Exception e) {
			}
		}
	}

	public void paint(Graphics2D g2) {
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);	  
	}

	private double xLeft;
	private double yTop;
}

