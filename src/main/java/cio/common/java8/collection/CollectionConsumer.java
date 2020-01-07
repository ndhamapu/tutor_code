package cio.common.java8.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class gives example of new <code> forEach </code>style method over a collection, the
 * action.accept(forAnElement) will be called. the
 * <code>java.lang.Iterable<T></code> interface has added an additional Method.
 * example below
 * 
 * @author nikhil
 *
 */
public class CollectionConsumer {
	
	/**
	 * A simple List with objects - based on the Criteria we want to Fire some Skills
	 */
	private static List<String> aCollection = new ArrayList<String>(Arrays.asList("hardworking", "focus", "sleepy", "unattentive"));
	
	
	private static Map<String, String> aMap = new HashMap<String, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
	    put("one","first");
	    put("two","Second");
	    put("three","Third");
	}};

	public void fireCandidate(List<String> skillList) 
	{
		
		skillList.forEach((elementInList) -> {
			
			if ("sleepy".equalsIgnoreCase(elementInList) || "unattentive".equalsIgnoreCase(elementInList)) 
			{
				System.out.println("[ Fire anyone who is  = " + elementInList + " ]");
			}
			else 
			{
				System.out.println("[ Good skill to have=" + elementInList + " ]");
			}
		});
	}

	
	public void prityPrintMap(Map<String, String> aMap) 
	{
		aMap.forEach((key, value) -> 
		{
		    System.out.println("[ Key : " + key + " Value : " + value  + " ]");
		});
	}
	public static void main(String[] args) 
	{

		CollectionConsumer ccExample = new CollectionConsumer();
		ccExample.fireCandidate(aCollection);
		ccExample.prityPrintMap(aMap);
	
	}
}
