package ct.primer.innerclass;
public class NestedTest
{
    
    private int private_member_variable = 100;

    public  static class StaticInnerClass  {
        private  static int local_variable=200;
        public   void printPrivateVariables()  {

	     // Creating instance of Outer class to access the member
            NestedTest outerClass = new NestedTest();
            System.out.println(outerClass.private_member_variable);
            //System.out.println(private_member_variable);
            //System.out.println(private_member_variable);
        }
    }
    public  void display(){
        //System.out.println(local_variable);
        System.out.println(StaticInnerClass.local_variable);
    }
/*
    public static void main(String args[]) {
        StaticInnerClass localStatic = new StaticInnerClass();
        localStatic.printPrivateVariables();
        NestedTest nt = new NestedTest();
        
       //nt.StaticInnerClass.printPrivateVariables();
       //nt.localStatic.printPrivateVariables();
       //NestedTest.StaticInnerClass.printPrivateVariables();
       //NestedTest.localStatic.printPrivateVariables();
       nt.display();
    }*/


}


class Test {
    public static void main(String args[]) {
        NestedTest nt = new NestedTest();
        //StaticInnerClass localStatic = new StaticInnerClass();
        //nt.StaticInnerClass localStatic = new StaticInnerClass();
        NestedTest.StaticInnerClass localStatic = new NestedTest.StaticInnerClass();
        //localStatic.printPrivateVariables();
    }
}