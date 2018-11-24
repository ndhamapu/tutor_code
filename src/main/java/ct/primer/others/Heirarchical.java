package ct.primer.others;
class A  { 
  void DisplayA()  { 
    System.out.println("I am in A"); 
  } 
} 

class B extends A   { 
  void DisplayB()  { 
     System.out.println("I am in B"); 
  } 
} 
class C extends A   { 
  void DisplayC()  { 
     System.out.println("I am in C"); 
  } 
} 
public class Heirarchical 
 { 
 public static void main(String args[]) 
 { 
 System.out.println("Calling for subclass C"); 
    C c = new C(); 
     c.DisplayA(); 
     c.DisplayC(); 

 System.out.println("Calling for subclass B"); 
     B b = new B(); 
     b.DisplayA(); 
     b.DisplayB(); 
 } 
}
