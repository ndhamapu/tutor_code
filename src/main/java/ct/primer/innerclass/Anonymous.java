package ct.primer.innerclass;
abstract class Person {
    abstract void eat();
}

public class Anonymous
{
    public static void main(String args[]){
        Person p = new Person(){
            void eat(){System.out.println("nice fruits");}
        };
        
        p.eat();
    }
}
