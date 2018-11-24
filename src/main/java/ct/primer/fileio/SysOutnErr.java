package ct.primer.fileio;

/**
 * Write a description of class SysOutnErr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SysOutnErr
{
    public static void main(String args[]){
        for (int i = 0; i < 5; i++) {
            System.out.println("out");
            System.err.println("err");
        }
    }
}
