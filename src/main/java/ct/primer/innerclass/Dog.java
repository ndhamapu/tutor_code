package ct.primer.innerclass;
class Dog {
    String name;
    Dog(String nm){
        name=nm;
    }
    String getName(){
        return name;
    }
    void setName(String nm){
        name=nm;
    }
public static void main( String[] args ) {
    Dog aDog = new Dog("Max");
    System.out.println("Before "+aDog.getName());
    foo(aDog);
    System.out.println("After "+aDog.getName()); 
}

public static void foo(Dog d) {
    
    d.setName("Fifi");
}
}