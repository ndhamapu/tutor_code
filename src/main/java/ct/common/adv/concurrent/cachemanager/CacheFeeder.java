package ct.common.adv.concurrent.cachemanager;

import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Logger;

import ct.common.bo.Order;
import ct.common.bo.OrderFactory;

/**
 * The Thread that adds Orders in the Cache via CacheManager
 * @author nikhil
 */
public class CacheFeeder implements Runnable
{

	private CacheManager cache = null;
	
	private boolean keepRunning = true;
	
	private static final Logger log =Logger.getLogger(CacheFeeder.class);

	@Override
	public void run()
	{
		while(keepRunning)
		{	
			List<Order> randomOrders = OrderFactory.getRandomOrders(150);
			
			Consumer<Order> ordConsumer = new Consumer<Order>() {
				public void accept(Order ord) 
				{
					cache.addOrder(String.valueOf(ord.getOrderId()), ord);
					
				}
			};
			
			randomOrders.forEach(ordConsumer);
			
			try {
				log.info("[ Generation Of Orders Complete. ]");
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}

		}

	}

}
