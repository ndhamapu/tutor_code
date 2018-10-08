package ct.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * The Class initializes a SLF4J factory and the Binding or the underlying implementation of the Logger can be 
 * of different Loggers.
 * The Idea is the imports don't have java.util.logger or org.apache.log4j.Logger imports which mean you don't have direct dependency
 * on these loggers.
 * <p> the way to use the logger is to add necessary jars  class path and use the factory to initialize the logger.
 * @author nikhil
 *
 */
public class SLF4JTest
{
	
	private static final Logger log = LoggerFactory.getLogger(SLF4JTest.class);
	
	public static void main(String[] args)
	{
		log.info("slf4j Logging Enabled.");
		
		while(true)
		{
			
			log.info("Log and Sleep");
			try 
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	

}
