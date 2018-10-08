package ct.common.adv.concurrent.cachemanager;

public class CacheCallsTest
{

	public static void main(String[] args)
	{
		
		CacheOrderConsumer consumer = new CacheOrderConsumer();
		
		CacheFeeder feeder = new CacheFeeder();
		
		Thread thread = new Thread(consumer);
		thread.setName("CacheConsumer");
		
		Thread threadProducer = new Thread(feeder);
		threadProducer.setName("CacheProducer");
		
		threadProducer.start();

		thread.start();
	}
	
}
