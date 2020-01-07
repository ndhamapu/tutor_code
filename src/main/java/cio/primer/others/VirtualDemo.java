package cio.primer.others;

 class Employee
{
   protected String name;
   protected String address;
   protected int empNo;

   public Employee(String name, String address, int number)    
   {
       this.name=name;
       this.address=address;
       this.empNo=empNo;
   }
public void mailCheck()    {
      System.out.println("Within mailCheck of Employee class ");
      System.out.println("Mailing a check to " + this.name
       + " " + this.address);
   }

}
 class Salary extends Employee
{
    double salary;
public Salary(String name, String address, int number, double  salary)    {
       super(name, address, number);
       this.salary=salary;
   }
public void mailCheck()   {
       System.out.println("Within mailCheck of Salary class ");
       System.out.println("Mailing a check to " + this.name
       + " " + this.address);
}
}
public class VirtualDemo
{
   public static void main(String [] args)
   {
      Salary s = new Salary("Sachi", "Atlanta", 3, 3600.00);
      Employee e = new Salary("John", "Boston", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
    }
}
