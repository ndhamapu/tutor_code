package ct.primer.others;

/**
 * Write a description of class DynamicBind here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 class Vehicle   {
    public void start()       {
           System.out.println("Inside start method of Vehicle");
      }
  }
class ACar extends Vehicle   {
    public void start()      {
       System.out.println("Inside start method of Car");
     }
}
class DynamicBindingTest {
 public static void main(String args[])   {
    Vehicle vehicle = new ACar(); //here Type is vehicle but object will be Car
    vehicle.start();       //ACar's start called because start() is overridden method
  }
}


