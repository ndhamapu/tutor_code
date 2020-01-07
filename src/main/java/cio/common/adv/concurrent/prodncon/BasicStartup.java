package cio.common.adv.concurrent.prodncon;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * A startup class for Producer consumer application this is the base for all multi threading application
 * @author nikhil
 * see {@code ct.common.adv.concurrent.prodncon.ProducerConsumerRunner}link
 *
 */
public class BasicStartup {

	private static final Logger log = Logger.getLogger(BasicStartup.class);
	
	public static void main(String[] args) 
	{
		log.info("[Starting Basic Startup.]");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Request-Consumer.xml");
		log.info("[Context Initialized.]");
		
		RequestManager manager = (RequestManager)appContext.getBean("requestManager");
		RequestProducer producer = (RequestProducer)appContext.getBean("requestProducer");
		
		Thread managerThread = new Thread(manager);
		Thread producerThread = new Thread(producer);
		
		managerThread.setName("TMng");
		producerThread.setName("TProd");
		
		managerThread.start();
		log.info("[RequestManger Started......]");
		
		producerThread.start();
		log.info("[Producer Thread Started......]");
	}
}
