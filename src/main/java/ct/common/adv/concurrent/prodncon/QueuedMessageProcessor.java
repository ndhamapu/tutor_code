package ct.common.adv.concurrent.prodncon;

import java.util.concurrent.BlockingQueue;

import org.apache.log4j.Logger;

/**
 * @author Nikhil call the class that extends this class via
 *         <code> Executors</code>
 * @param <T>
 */
public abstract class QueuedMessageProcessor<T> implements Runnable {
	
	private BlockingQueue<T> queue;

	private static final Logger LOG = Logger.getLogger(QueuedMessageProcessor.class);

	public void run()
	{
		while (queue != null)
		{
			try
			{
				T element = queue.take();
				process(element);
			} 
			catch (Exception e)
			{
			
				LOG.warn("[exception Details]",e);
				
				//Just eat
			}
		}

	}

	/**
	 * Class that extends {@link ct.common.adv.concurrent.prodncon.QueuedMessageProcessor<T>} must
	 * implement this method.
	 * 
	 * @param element
	 */
	public abstract void process(T element);

	public void setQueue(BlockingQueue<T> queue) {
		this.queue = queue;
	}
}
