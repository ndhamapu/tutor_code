package ct.primer.exception;

/**
 * Write a description of class ThrowTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThrowTest
{
    
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
}
public static void main(String args[]) {
    try {
        demoproc();
    } catch(NullPointerException e) {
        System.out.println("Recaught: " + e);
    }
}
}
