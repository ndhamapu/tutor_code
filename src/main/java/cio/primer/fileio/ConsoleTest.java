package cio.primer.fileio;
import java.io.Console;
import java.io.IOException;
/**
 * Write a description of class ConsoleTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsoleTest
{
    public static void main (String args[]) throws IOException {

    Console c = System.console();
       if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        String login = c.readLine("Enter your login: ");
        char [] oldPassword = c.readPassword("Enter your old password: ");
        String pass = String.valueOf(oldPassword);
        System.out.println("Password given=" + pass);
        c.format("Passwords don't match. Try again.%n");
    }
}
