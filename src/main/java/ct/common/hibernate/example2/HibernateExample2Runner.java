package ct.common.hibernate.example2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateExample2Runner
{
	private static final Logger log = Logger.getLogger(HibernateExample2Runner.class);

	public static void main(String[] args) throws Exception
	{
		HibrnateConfiguration context = new HibrnateConfiguration();
		/**
		 * get session as we want to persist Java Objects
		 */
		Session session = context.getSession();
		/**
		 * If any insertion or update fails we want to Rollback - add them in transaction.
		 */
		Transaction tran = session.beginTransaction();
	
		tran.begin();
		/**
		 * Create the Business Objects
		 */
		Set<Report> reports = new HashSet<Report>();

		Report reportOne = new Report();
		reportOne.setCanBeRun(true);

		reportOne.setContactPerson("Nikhil Dh");
		reportOne.setCritical(false);

		Parameter param1 = new Parameter();
		param1.setName("from");
		param1.setReport(reportOne);
		param1.setType("date");
		param1.setValue("today");

		Parameter param2 = new Parameter();
		param2.setName("to");
		param2.setReport(reportOne);
		param2.setType("date");
		param2.setValue("today+1");

		List<Parameter> params = new ArrayList<Parameter>();
		params.add(param1);
		params.add(param2);
		reportOne.setParameters(params);

		reportOne.setReportName("Daily Credit Trades Report");
		reportOne.setTeam("Credit");

		Set<Schedule> schedules = new HashSet<Schedule>();

		reports.add(reportOne);
		Schedule defaultSchedule = new Schedule();
		defaultSchedule.setReports(reports);
		defaultSchedule.setRunOnMon(true);
		defaultSchedule.setRunOnTue(true);
		defaultSchedule.setRunOnWed(true);
		defaultSchedule.setRunOnThu(true);
		defaultSchedule.setRunOnFri(true);
		defaultSchedule.setRunOnSat(false);
		defaultSchedule.setRunOnSun(false);
		defaultSchedule.setTime(LocalTime.now());
		defaultSchedule.setZone("IST");

		reportOne.setSchedules(schedules);
		schedules.add(defaultSchedule);

		/*
		 * Just Saving One Object report - Other objects are getting saved.
		 * <p>
		 * persist() is
		 * well defined. It makes a transient instance persistent. However, it doesn't
		 * guarantee that the identifier value will be assigned to the persistent
		 * instance immediately, the assignment might happen at flush time. The spec
		 * doesn't say that, which is the problem I have with persist().
		 * <p>
		 * persist() also guarantees that it will not execute an INSERT statement if it
		 * is called outside of transaction boundaries. This is useful in long-running
		 * conversations with an extended Session/persistence context.
		 * 
		 */
		session.persist(reportOne);

		/*
		 * Transaction Object - A Transaction represents a unit of work with the
		 * database and most of the RDBMS supports transaction functionality.
		 * Transactions in Hibernate are handled by an underlying transaction manager
		 * and transaction (from JDBC or JTA). This is an optional object and Hibernate
		 * applications may choose not to use this interface, instead managing
		 * transactions in their own application code.
		 * 
		 */
		tran.commit();

		Report report = (Report) session.get(Report.class, reportOne.getReportId());
		log.info(" Report Saved in DB ID: " + report.getReportId() + " Name : " + report.getReportName());

		session.close();
	}

}
