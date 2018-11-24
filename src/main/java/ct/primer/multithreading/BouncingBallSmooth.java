package ct.primer.multithreading;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
 
public class BouncingBallSmooth extends Applet implements Runnable
{
        int x,y;
        int dx,dy;
        Thread t;
        public void init()
        {
        x=40;
        y=40;
        dx=30;
        dy=30;
 
        t=new Thread(this);
        t.start();
        }
 
        public void run()
        {
                
                while(true)
                {
                    if(x<40 || x>260)
                    {
                        dx=-dx;
                    }
                    if(y<40 || y>230)
                    {
                        dy=-dy;
                    }
                        x+=dx;
                        y+=dy;
                        
                    try
                    {
                                Thread.sleep(200);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    repaint();
                }
        }
 
        public void paint(Graphics g)
        {
            float r, gr, b;
            Random rand = new Random();
            r = rand.nextFloat();
            gr = rand.nextFloat();
            b = rand.nextFloat();
            Color randomColor = new Color(r, gr, b);
            
            g.drawRect(10,10,300,270);
            g.setColor(randomColor);
            g.fillOval(x,y,30,30);
                
        }
}