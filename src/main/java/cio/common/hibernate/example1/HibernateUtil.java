package cio.common.hibernate.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cio.common.spring.example3.DBViewer;

public class HibernateUtil
{

	private static final String USER = "sa";
	private static final String ORG_HSQLDB_JDBC_DRIVER = "org.hsqldb.jdbcDriver";
	public static final String HIBERNATE_CONFIG = "hibernate.example1.cfg.xml";
	private Session session;
	private Statement st;

	private static final Logger log = Logger.getLogger(HibernateUtil.class);

	public HibernateUtil()
	{
		try {

			DBViewer hsqlViewer = new DBViewer();
			hsqlViewer.startDBManager();
			Configuration config = new Configuration().configure(HIBERNATE_CONFIG);
			/*
			 * Remove tag in hibernate.example1.cfg.xml
			 * <code> <mapping resource="ct/common/hibernate/example1/Order.hbm.xml" /> </code>  
			 * and add below in code
			 * config.addClass(Order.class);
			 * 
			 * thats the same thing
			 */
			SessionFactory sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();

			// Load the JDBC driver.
			Class.forName(ORG_HSQLDB_JDBC_DRIVER);
			log.info("[ Loading the HSQL JDBC Driver ]");
			// Establish the connection to the database.
			final String url = "jdbc:hsqldb:data/testdb";

			Connection conn = DriverManager.getConnection(url, USER, "");
			log.info("[ Got Connection. ]");
			st = conn.createStatement();

		} catch (Exception ex) {
			log.info("Exception Creating Session Factory ", ex);
		}
	}

	public Session getSession()
	{
		return session;
	}

	public void executeSQLCommand(String sql) throws Exception
	{
		log.debug("executing " + sql);
		st.executeUpdate(sql);
	}

}