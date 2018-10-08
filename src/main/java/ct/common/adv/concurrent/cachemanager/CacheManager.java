package ct.common.adv.concurrent.cachemanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import ct.common.bo.Order;

/**
 * @author nikhil This class is a Wrapper over a in memory Cache over a Map as
 *         Simple implementation like HashTable, HashMap and a ConcurrentHashMap
 *         can be used to pass its Implementation
 *         
 *         <p> Its always good practice to wrap simple HashMaps which act like Cache 
 *         with a wrapper class this way you can change the internal data structure
 *         
 *
 */
public class CacheManager
{
	
	private static final Logger log = Logger.getLogger(CacheManager.class);
	/**
	 * Internal data structure that is not exposed to the External World
	 */
	private static Map<String, Order> cache = new HashMap<>();

	public static Order getOrder(String ordID)
	{
		return cache.get(ordID);
	}

	public static void addOrder(String id, Order ord)
	{
		cache.put(id, ord);
	}

	public static void removeOrder(String clOrdId)
	{

		Iterator<Entry<String, Order>> it = cache.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Order> next = it.next();
			/*
			 * The client Order id matched the Id
			 */
			if (clOrdId == next.getValue().getClOrdId()) {
				log.info("Match found Removing ClOrderId = "+ clOrdId );
				it.remove();
			}
		}
	}

	public static List<String> getClientOrderIds()
	{
		Iterator<Entry<String, Order>> it = cache.entrySet().iterator();
		List<String> clOrdIds = new ArrayList<String>();

		while (it.hasNext())
		{
			Entry<String, Order> next = it.next();
			/*
			 * The client Order id matched the Id
			 */
			clOrdIds.add(next.getValue().getClOrdId());
		}

		return clOrdIds;
	}

}
