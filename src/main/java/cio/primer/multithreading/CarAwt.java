package cio.primer.multithreading;
import java.awt.Frame;
import java.awt.Graphics;

public class CarAwt extends Frame 
{
	public Car car1, car2;
	CarAwt(){

	  //car1 = new Car(this ,100, 100, 2);
	 // car2 = new Car(this, 200, 200, 1);
	  car1.start();
	  car2.start();
	}

	public void paint(Graphics g)
   	{  

	 // car1.myPaint(g);
	//  car2.myPaint(g);	  
   	}

	public static void main(String args[]){

	CarAwt car = new CarAwt();
	car.setVisible(true);
	car.setSize(400, 400);
   }

}
