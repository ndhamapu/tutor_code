package cio.common.java8.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import cio.common.bo.Order;
import cio.common.bo.Order.Side;
import cio.common.bo.OrderFactory;
/**
 * Example Shows simple Lambda use and Predicate which are being introduced in Java 8
 * @author nikhil
 */
public class PredicateExample
{
	public static void main(String args[])
	{
		//Predicate<Integer> positive = i -> i > 0;
		Predicate<Order> positiveMatchFunction = (ord) -> 
		{
			return  ord.getSide() == Side.SELL;
		};
		
		List<Order> filteredList = filterList(OrderFactory.getRandomOrders(50), positiveMatchFunction);
		filteredList.forEach((value) -> {System.out.println("[ is a Short Order = " + value + " ] "); });
		
		// Similar Example where Additional string can be passed to the sys out
		//filteredList.forEach(System.out::println);
	}

	public static List<Order> filterList(List<Order> listOfIntegers, Predicate<Order> predicate)
	{
		List<Order> filteredList = new ArrayList<Order>();
		for (Order ord : listOfIntegers) 
		
		{
			if (predicate.test(ord))
			{
				filteredList.add(ord);
			}
		}
		return filteredList;
	}
}
