package ct.primer.fileio;
import java.io.*;

class Person implements java.io.Serializable{
    String name, address;
    int age;
    Person(String nm, String addr, int ageLoc){
        name = nm;
        address = addr;
        age = ageLoc;
    }
    void display(){
        System.out.println("Name=" + name + " address=" + address 
                            + " age=" + age);

    }
}
public class ObjectStreamExample
{

    public static void main(String agrs[])throws IOException,ClassNotFoundException 
    {
        
        String filename = "ObjectFile.txt";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
        Person person = new Person("David", "123 Main Street", 23);
        outputStream.writeObject(person);
        outputStream.close();
        
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
        person = (Person) inputStream.readObject();
        person.display();
        inputStream.close();

    }
}
