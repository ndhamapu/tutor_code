package cio.common.java8.generics;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cio.common.bo.IfDone;
import cio.common.bo.OCO;
import cio.common.bo.Order;
import cio.common.bo.Order.Side;

/**
 * This class explains upper bound generic.
 * <p>
 * The list should always Have elements of Similar Type the code ? extends
 * "Clazz" says that all the elements in the List will be same and the value of
 * "?" unbound variable is same. i.e. even if IFDone Order or OCO Order both
 * classes satisfy the condition the same list cannot contain Both orders.
 * 
 * <p>
 * ? extends "clazz" in a list prevents from adding elements belonging to class
 * "clazz" or that extend "clazz"
 * 
 * @author nikhil
 *
 */
public class GenericsUpperBoundProducerExtends
{
	/**
	 *  ifDone Order
	 */
	public List<IfDone> orders = new ArrayList<>();

	/**
	 *  ifDone Order
	 */
	public List<OCO> ocoOrders = new ArrayList<>();

	
	private static final Logger log = Logger.getLogger(GenericsUpperBoundProducerExtends.class);

	public static void main(String[] args)
	{

		GenericsUpperBoundProducerExtends test = new GenericsUpperBoundProducerExtends();
		/**
		 * Not Allowed to add Orders as we need exactly the classes that Extends order
		 * as we want to consume the elements if the Order class was abstract then some
		 * implementation would be missing?
		 */
		// orders.add(OrderFactory.getRandomOrders(1).get(0));

		IfDone idOrder = new IfDone(1, 1, Side.BUY, 100000, 99.67, "1234-CLordid");
		idOrder.addChildOrder(1, 1, Side.SELL, 100000, 99.69, "1234-1-CLordid");

		test.orders.add(idOrder);

		test.orderProcessor(test.orders);
		
		
		OCO ocoOrder = new OCO(1, 1, Side.BUY, 100000, 99.4, "1233-CLordid");
		ocoOrder.addChildOrder(1, 1, Side.SELL, 100000, 99.5, "1233-1-CLordid");
		
		test.ocoOrders.add(ocoOrder);
		test.orderProcessor(test.ocoOrders);

	}

	public void orderProcessor(List<? extends Order> lst)
	{
		lst.forEach(x ->
		{
			log.info(" Order Type " + x.getOrderType());
		});
	}

}
