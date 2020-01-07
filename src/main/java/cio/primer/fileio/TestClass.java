package cio.primer.fileio;
class A {}

class B extends A {}

public class TestClass {
    public static void main(String args[]) {
        A a, a1;
        B b;
        a = new A();
        a1 = a;
        b = new B();
        a = b; 
        b = (B)a1; // Error
    }
}
