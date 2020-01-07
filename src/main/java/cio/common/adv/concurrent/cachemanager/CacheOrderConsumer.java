package cio.common.adv.concurrent.cachemanager;

import java.util.List;

import org.apache.log4j.Logger;

public class CacheOrderConsumer implements Runnable
{

	private boolean keepRunning = true;

	private static final Logger log = Logger.getLogger(CacheOrderConsumer.class);

	@Override
	public void run()
	{

		while (keepRunning) {
			try {

				List<String> clientOrderIds = CacheManager.getClientOrderIds();

				for (String clOrdId : clientOrderIds)
				{
					CacheManager.removeOrder(clOrdId);
				}

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

				}

			} catch (Exception e) {
				// Logging everything may not be advisable
				log.info(" ************************************************************************************************* ");
				log.info(" Its a Thread catch all exception inside while..", e);
				log.info(" ************************************************************************************************* ");
			}
		}

	}

}