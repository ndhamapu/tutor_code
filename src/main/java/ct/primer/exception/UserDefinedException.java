package ct.primer.exception;

class ageExceededException extends Exception{
    public ageExceededException(){
        System.out.println("Max Age of 15 has been exceeded");
    }
}
class noArgumentException extends Exception{
     noArgumentException(){
        System.out.println("No argument has been passed");
    }
}
public class UserDefinedException
{
    public static void main(String args[]) throws noArgumentException, ageExceededException {
        
        if(args.length < 1){
            throw new noArgumentException();
        }
        else {
            
            int age = Integer.parseInt(args[0]);
            if(age > 15)
                throw new ageExceededException();
            else 
                System.out.println("Your age is less than 15");
        }
    }
}
