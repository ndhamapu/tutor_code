package ct.primer.innerclass;

/**
 * Example of non-static Inner class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OuterClass
{
    private int pData = 100;

    public  class MemberInnerClass  {
        //public static int num=0; // This is not allowed
        public  int num=0;
        public MemberInnerClass(int num){
            this.num=num;
        }
        public  void printOuterData()  {
            System.out.println("Printing Outer Data from Inner=" +pData);
        }
        public  void printInnerData()  {
            System.out.println("Printing Inner Data from Inner=" + num);
        }
    }
    public void display(){
        MemberInnerClass NI = new MemberInnerClass(20);
        System.out.println("Display method of OuterClass=" + NI.num);
        NI.printInnerData();
        //System.out.println(num);
        //System.out.println("Display method of OuterClass=" + num);
    }
    public static void main(String args[]) {
        OuterClass OuterInstance = new OuterClass();
        OuterInstance.display();
        // Can't create Inner class directly here
        //MemberInnerClass normalInner = new MemberInnerClass(200);
        
        // Can create Inner class using outer class
        OuterClass.MemberInnerClass normalInner = OuterInstance.new MemberInnerClass(200);
        normalInner.printOuterData();
        //normalInner.printInnerData();
        //MemberInnerClass m = new MemberInnerClass();
    }
}
/*
class Test{
    public static void main(String args[]) {
        OuterClass OuterInstance = new OuterClass();
        OuterInstance.display();
        //MemberInnerClass normalInner = new MemberInnerClass(200);
        OuterClass.MemberInnerClass normalInner = OuterInstance.new MemberInnerClass(200);
        normalInner.printOuterData();
        normalInner.printInnerData();
    }
}
*/