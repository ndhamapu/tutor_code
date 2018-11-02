package ct.common.java8.generics;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import ct.common.bo.Order;
import ct.common.bo.OrderFactory;

/**
 * 
 * <P>
 * <b> Example Tells Why Generic is Important to Java Simple Class that tells
 * the Problem that existed before Generic.
 * 
 * Preventing the Poison form Spreading in the System, the boundry should
 * restrict such messages Generic comes to the rescue.
 * 
 * @author nikhil
 * 
 * 
 *         earlier they prevented this with poisonMessage
 * 
 *         <code> 
 *         Object obj = poisonMessage; 
 *         if (obj instanceof Order) 
 *         {
 *         randomOrders.add(poisonMessage); 
 *         }
 *         why if(poisonMessage instanceof Order) won't work - something to study.
 */
public class GenericsTest01
{

	/**
	 * @param oldList
	 *            :This function takes Orders List and consumes the orders.
	 */
	@SuppressWarnings("rawtypes")
	public void consumeOrders(List oldList)
	{
		Objects.nonNull(oldList);
		Iterator iterator = oldList.iterator();

		while (iterator.hasNext()) {
			Order expectedOrder = (Order) iterator.next();
			System.out.println(expectedOrder);
		}

	}

	/**
	 * 
	 * @param oldList
	 *            :This function takes Orders List and consumes the orders.
	 * 
	 */
	public void consumeOrdersGenerics(List<Order> oldList)
	{
		Objects.nonNull(oldList);
		// delete like to the left of "=" Move Cursor over Iterator and press Ctrl + 2 +
		// l
		Iterator<Order> iterator = oldList.iterator();

		while (iterator.hasNext()) {
			// No Casting
			Order expectedOrder = iterator.next();
			System.out.println(expectedOrder);
		}

	}

	public static void main(String[] args)
	{
		GenericsTest01 test = new GenericsTest01();
		List randomOrders = OrderFactory.getRandomOrders(3);
		test.consumeOrders(randomOrders);
		String poisonMessage = "A Message that Cannot be consumed - generally in a queue";
		/*
		 * Note We are able to Add String inside list where Orders are expected.
		 */
		randomOrders.add(poisonMessage);

		/**
		 * earlier they prevented this with poisonMessage
		 * 
		 * <code>
		 *   Object obj = poisonMessage;
		if (obj instanceof Order)
		{
			randomOrders.add(poisonMessage);
		}
		
		why if(poisonMessage instanceof Order) won't work
		 *   </code>
		 */
		// Try again to Consume ? uncomment the below Code will give exception.

		test.consumeOrders(randomOrders);
		/**
		 * Same code with Generic List of Orders or generic Types
		 */
		List<Order> listWithGenerics = OrderFactory.getRandomOrders(3);

		/**
		 * Generic Wont let it Compile ! - try  and uncomment
		 */
		// listWithGenerics.add(poisonMessage);

	}

}
