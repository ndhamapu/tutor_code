package ct.primer.collection;

/**
 * Write a description of class TestLinkedHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TestLinkedHashMap
{
    public static void main(String args[]){
    
    LinkedHashMap<String,Double> lhm = new LinkedHashMap<String,Double>();      
// Put elements to the map
      lhm.put("Zara", new Double(3434.34));
      
      lhm.put("Ayan", new Double(1378.00));
      lhm.put("Mahnaz", new Double(123.22));
      lhm.put("Aya", new Double(1378.00));
      // Get a set of the entries
      Set set = lhm.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.println(me.getKey() + ": " + me.getValue()  );
        } 
// Deposit 1000 into Zara's account
      double balance = ((Double)lhm.get("Zara")).doubleValue();
      lhm.put("Zara", new Double(balance + 1000));
      System.out.println("New Value for Zara=" + lhm.get("Zara"));
      
    }
}
