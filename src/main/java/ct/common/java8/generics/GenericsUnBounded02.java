package ct.common.java8.generics;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import ct.common.bo.Order;
/**
 * Bounded v.s. Unbounded
 * List lst  v.s. List<?> lst
 * <p> The bounded one prevents adding anything Other than null.</p>
 * <p> Used in most cases if the methods to be invoked on the elements in the list which are from Object class. 
 * @author nikhil
 *
 */
public class GenericsUnBounded02
{

	private static final Logger log = Logger.getLogger(GenericsUnBounded02.class);
	
	public static int elementsInCommon (Set<?> s1, Set<?> s2) 
	{
		int commonCount = 0;
		
		for ( Object obj1 : s1)
		{
			if(s2.contains(obj1))
			{
				commonCount++;
			}
		}
		
		return commonCount;
	}
	
	
	public static void main(String[] args)
	{
		/**
		 * Prevents adding anything other than null
		 */
		//Set<?> first = new HashSet<>();
		Set first = new HashSet<>();
		
		Order ord = null;
		first.add(ord);
		first.add("STRING");
		first.add("Name");
		first.add(1);
		
		
		Set second = new HashSet<>();
		second.add("String");
		second.add("STRING");
		second.add("Name");
		second.add(2);
		
		int commonElements = elementsInCommon(first,second);
		
		log.info(" Matched Element " + commonElements);
	}
}
