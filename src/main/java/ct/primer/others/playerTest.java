package ct.primer.others;

/**
 * Write a description of class playerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class cricketPlayer {
    String name;
    int playerCode;
    int runs;
    
    public cricketPlayer(String nm, int pCode, int rns){
        name = nm;
        playerCode = pCode;
        runs = rns;
    }
    public void displayData(){
        System.out.println("In class Name=" + name + " Player Code=" + playerCode + " runs=" + runs);
    }
}
public class playerTest
{
    
    public static cricketPlayer readFromTerminal() throws IOException
    {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String strLine = in.readLine();
    String delims = "[ ]";
    String[] tokens = strLine.split(delims);
    cricketPlayer myPlayer = new cricketPlayer(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
    
    in.close(); 
   
    return myPlayer;
}

    
    public static void main(String args[])throws Exception
    {

        cricketPlayer cPlayer = readFromTerminal();
        cPlayer.displayData();
    }
}
