package ct.common.adv.concurrent.prodncon;

import org.apache.log4j.Logger;

public class RequestManager extends QueuedMessageProcessor<MyRequest>
{

	private static final Logger log = Logger.getLogger(RequestManager.class);

	@Override
	public void process(MyRequest element)
	{

		log.info(" Processed Message " + element.getUrl() + " : " + element.getType());

	}

}
