package ct.primer.collection;

/**
 * Write a description of class TestTreeMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TestTreeMap
{
    public static void main(String args[]){
    
    TreeMap<String, Double> tm = new TreeMap<String, Double>();
      // Put elements to the map
      tm.put("Tapan", new Double(3434.34));
      tm.put("David", new Double(1378.00));
      tm.put("Lunar", new Double(123.22));
      tm.put("Harry", new Double(1238.22));
      // Get a set of the entries
      Set set = tm.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.println(me.getKey() + ": " + me.getValue()  );
        } 
// Deposit 1000 into David's account
      double balance = ((Double)tm.get("David")).doubleValue();
      tm.put("David", new Double(balance + 1000));
      tm.get("David");
    }
}
