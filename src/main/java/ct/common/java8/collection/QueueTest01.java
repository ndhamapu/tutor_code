package ct.common.java8.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.log4j.Logger;

import ct.common.bo.Order;
import ct.common.bo.OrderFactory;

/**
 * This class gives a familiarity with Different implementations of Queue The
 * example demonstrates LinkedList implementation.
 * 
 * We can create a Consumer that consumes each element from the Linked List
 * 
 * @author nikhil
 *
 */
public class QueueTest01
{

	/**
	 * Define the data Structure.
	 */
	private Queue<Order> queue = new LinkedList<>();
	
	private static List<Order> errorQueue = new ArrayList<Order>();
	

	private static final Logger log = Logger.getLogger(QueueTest01.class);

	// forEach takes a Consumer of the Pattern
	// Consumer<Order> ordConsumer = () -> { };

	public void addElementsInQueue()
	{
		List<Order> randomOrders = OrderFactory.getRandomOrders(5);

		randomOrders.forEach((ord) ->
		{
			queue.offer(ord);

		});

	}

	public void getdElementsInQueue()
	{

		// queue.forEach((ord) ->
		while (queue.peek() != null) {
			Order ord = null;
			try {

				ord = queue.peek();
				if (ord != null) {
					process(ord);
				}

			} 
			catch (Exception e) 
			{
				log.error("[Error !! processing Order " + ord + " ]");
			} 
			finally 
			{
				queue.poll();
				log.info("[removed the Current Order..]");
			}
		}

	}

	/**
	 * The processing can throw runtime exception
	 * 
	 * @param ord
	 */
	private void process(Order ord)
	{
		if (ord.getPrice() <= 50.00) {
			errorQueue.add(ord);
			throw new RuntimeException("Price too Less not placing the Order");
		}

		log.info("[Processed the Order" + ord + " ]");
	}

	public static void main(String[] args)
	{
		QueueTest01 test = new QueueTest01();
		test.addElementsInQueue();
		test.getdElementsInQueue();
		
		log.info("[ Total Orders in Error ]" + errorQueue );
	}
}
