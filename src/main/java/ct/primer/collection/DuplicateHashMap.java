package ct.primer.collection;


/**
 * Write a description of class DuplicateHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class DuplicateHashMap
{
 Map<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

public  void insertMethod() {
   // Add data with duplicate keys
   addValues("A", "a1");
   addValues("A", "a2");
   addValues("B", "b");
   // View data.
   Iterator it = hashMap.keySet().iterator();
   ArrayList<String> tempList = null;

   while (it.hasNext()) {
      String key = it.next().toString();             
      tempList = hashMap.get(key);
      if (tempList != null) {
         for (String value: tempList) {
            System.out.println("Key : "+key+ " , Value : "+value);
         }
      }
   }
}

private void addValues(String key, String value) {
   ArrayList<String> tempList = null;
   if (hashMap.containsKey(key)) {
      tempList = hashMap.get(key);
      if(tempList == null)
         tempList = new ArrayList<String>();
      tempList.add(value);  
   } else {
      tempList = new ArrayList<String>();
      tempList.add(value);               
   }
   hashMap.put(key,tempList);
}
public static void main(String args[]){
    DuplicateHashMap dm = new DuplicateHashMap();
    dm.insertMethod();
}
}
