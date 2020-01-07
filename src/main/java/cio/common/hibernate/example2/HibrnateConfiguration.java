package cio.common.hibernate.example2;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import cio.common.spring.example3.DBViewer;

/**
 * Same class as HibernateUtil just avoided same name to avoid confusion and
 * changed the configuration
 * 
 * @author nikhil
 *
 */
public class HibrnateConfiguration
{

	private static final String HIBERNATE_CONFIG = "hibernate.example2.cfg.xml";
	private Session session;

	private static final Logger log = Logger.getLogger(HibrnateConfiguration.class);

	/**
	 * Do in constructor if the Object is created then we know everything went well.
	 */
	public HibrnateConfiguration()
	{
		try {

			DBViewer hsqlViewer = new DBViewer();
			hsqlViewer.startDBManager();

			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure(HIBERNATE_CONFIG).build();
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory factory = meta.getSessionFactoryBuilder().build();
			session = factory.openSession();

		} catch (Exception ex) 
		{
			log.info("Exception Creating Session Factory ", ex);
		}
	}

	public Session getSession()
	{
		return session;
	}

}
