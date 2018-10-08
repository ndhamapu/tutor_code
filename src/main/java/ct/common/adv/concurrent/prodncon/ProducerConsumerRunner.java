package ct.common.adv.concurrent.prodncon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import org.apache.log4j.Logger;

public class ProducerConsumerRunner
{	
	//1. common Mistake of keeping the Copy paste Class Name
	private static final Logger log = Logger.getLogger(BasicStartup.class);

	public static void main(String[] args) 
	{
		/**
		 * Create Producer and Consumer
		 */
		RequestManager manager = new RequestManager();
		RequestProducer producer = new RequestProducer();
		/**
		 * The Link between them
		 */
		BlockingQueue<MyRequest> queue = new LinkedBlockingDeque<>();
		
		// Assign References
		 manager.setQueue(queue);
		 // what if the Reference is not Set
		 producer.setQueue(queue);
		
		Thread managerThread = new Thread(manager);
		Thread producerThread = new Thread(producer);
		
		managerThread.setName("Tmng");
		
		managerThread.start();
		log.info("[RequestManger Started......]");
		
		producerThread.start();
		log.info("[Producer Thread Started......]");
	}
}
