package ct.common.spring.example3;
/**
 * The pattern to enable JMX is 'ClassNameMBean' interface and 'ClassName' should implement it.
 * ApplicationControlMBean the Class will be ApplicationControl that implements it. 
 * @author nikhil
 *
 */
public interface TradeEntryMBean
{

	 void bookOrder (String orderId,String instId,String side,String quantity,String px,String clOrderIdString);
	 
	 void cancelOrder(String tradeId);
	 
	 /**
	  * Delete is just for example : generally system never deletes the order records just makes the active flag or 
	  * recrd type as New --> cancel
	  * @param tradeId
	  */
	 void deleteOrder(String tradeId);
}
