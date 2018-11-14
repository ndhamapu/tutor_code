package ct.common.java8.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Difference between List and List&lt;Object&gt;
 * <p>
 * <tt> List &lt;String&gt; can be passed to List but List&lt;String&gt; cannot be passed to the
 * List&lt;Object&gt;
 * 
 * </tt>
 * 
 * 
 * @author nikhil
 *
 */
public class Generics01Casting
{
	private static void unsafeAdd(List list, Object o)
	/**
	 * Change the signature of the method to have List<Object> this prevent the code at compile time.
	 * 
	 * the list.add(0) is generating a Compiler warning if we ignore it we will pay the price.
	 */
	//private static void unsafeAdd(List<Object> list, Object o)
	{
		list.add(o);
	}

	public static void main(String[] args)
	{
		List<String> strings = new ArrayList<>();
		unsafeAdd(strings, Integer.valueOf(42));
		String s = strings.get(0);
	}

}
