package cio.common.hibernate.example1;

import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 * First Example that inserts an Order into the HSQL database. The important
 * part to remember are
 * <p>
 * session - Objects that we define are set in session it gets synced with database by hibernate, he
 * manages that
 * </P>
 * <p>
 * enum - Side is an enum we are inserting enum in Database other columns are
 * generally mapping of data types Where as enum is like conversion
 * </P>
 * @author nikhil
 */
public class ORMExampleRunner

{
	private static final Logger log = Logger.getLogger(ORMExampleRunner.class);

	public static void main(String[] args) throws Exception
	{
		HibernateUtil hibernateUtil = new HibernateUtil();

		Session session = hibernateUtil.getSession();

		int instrumentId = 1;
		Side buy = Side.BUY;
		Side sell = Side.SELL;
		long qty = 1000000;

		Order ord1 = new Order(instrumentId, buy, qty, 98.6, "ClientOrderIdOne");
		Order ord2 = new Order(instrumentId, sell, qty , 98.7, "ClientOrderIdtwo");
		Order ord3 = new Order(instrumentId, buy, qty, 98.8, "ClientOrderIdThree");

		session.save(ord1);
		session.save(ord2);
		session.save(ord3);
		session.flush();

		Order order = (Order) session.get(Order.class, ord2.getOrderId());

		log.info(" Order returned form DB" + order);

		session.close();
		
	}

}
