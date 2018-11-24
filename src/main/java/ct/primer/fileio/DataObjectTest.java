package ct.primer.fileio;
import java.io.*;
//import java
/**
 * Write a description of class DataObjectTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataObjectTest
{
    public static void main(String args[])throws IOException
    {
        String dataFile = "invoicedata.txt";
        double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        int[] units = { 12, 8, 13, 29, 50 };
        String[] descs = {"Shirt", "Mug", "Dolls", "Pins", "Chain"};
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                            new FileOutputStream(dataFile)));
        for (int i = 0; i < prices.length; i ++) {
            
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
        }
        out.flush();
        out.close();
        double price, total=0;
        int unit;
        String desc;
        
        DataInputStream in = new DataInputStream(new  BufferedInputStream(new FileInputStream(dataFile)));
        int count=0;
        while (count<prices.length) {
            price = in.readDouble();
            unit = in.readInt();
            desc = in.readUTF();
            System.out.format("You ordered %d units of %s at $%.2f%n",  unit, desc, price);
            total += unit * price;
            System.out.format("Total= %.2f%n", total);
            count++;
    }


    }
}
