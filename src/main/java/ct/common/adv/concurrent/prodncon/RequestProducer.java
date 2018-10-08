package ct.common.adv.concurrent.prodncon;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;

/**
 * @author Nikhil This class creates Dummy Requests and Sends them the sending
 *         is adding into the Queue which can be visualized like any method.
 * @param <T>
 */
public class RequestProducer implements Runnable
{

	private static final int MESSAGE_TO_QUEUE = 100;

	private BlockingQueue<MyRequest> queue;

	private AtomicBoolean keepRunning = new AtomicBoolean(true);

	private static final Logger log = Logger.getLogger(RequestProducer.class);

	@Override
	public void run()
	{
		try {
			// generate 100 Requests
			while (keepRunning.get()) {
				randomRequestGenerator();
				log.info("[ Requests Generated ]");
			}
			// GIVE CONSUMER SOME TIME
			log.info("[ sleeping]");
			Thread.sleep(5000);
		} catch (Exception e) {
			log.warn("[exception Details]", e);
		}
	}

	/**
	 * Each run adds 100 requests
	 * 
	 * @throws InterruptedException
	 */
	public void randomRequestGenerator() throws InterruptedException
	{
		Objects.requireNonNull(queue , "Queue Reference Missing");
		Random random = new Random();
		random.setSeed(40);
		// HOW MANY OBJECTS TO PRODUCE
		for (int i = 0; i < MESSAGE_TO_QUEUE; i++) {
			int nextInt = random.nextInt(40);
			MyRequest aReq = new MyRequest();
			aReq.setUrl("/");
			if (nextInt <= 10) {
				aReq.setType(RequestType.select);
			} else if (nextInt <= 20) {
				aReq.setType(RequestType.update);

			} else if (nextInt <= 30) {
				aReq.setType(RequestType.insert);
			} else {
				aReq.setType(RequestType.delete);
			}
			queue.put(aReq);
		}

	}

	// can stop thread
	public void setKeepRunning(AtomicBoolean keepRunning)
	{
		this.keepRunning = keepRunning;
	}

	public void setQueue(BlockingQueue<MyRequest> queue)
	{
		this.queue = queue;
	}
}
