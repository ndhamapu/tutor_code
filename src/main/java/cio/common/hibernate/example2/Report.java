package cio.common.hibernate.example2;

import java.util.List;
import java.util.Set;

public class Report
{
	
	private Integer reportId;
	
	private String reportName;
	
	private String contactPerson;
	
	private boolean critical;
	/**
	 * There are no important pre-run scenarios you can re-run this report
	 */
	private boolean canBeRun;
	
	private String team;
	/**
	 * Many to Many
	 */
	private Set<Schedule> schedules;
	
	/*
	 * One to many - one Report has Many Parameter
	 */
	private List<Parameter> parameters;
	
	public String getReportName()
	{
		return reportName;
	}

	public void setReportName(String reportName)
	{
		this.reportName = reportName;
	}

	public String getContactPerson()
	{
		return contactPerson;
	}

	public void setContactPerson(String contactPerson)
	{
		this.contactPerson = contactPerson;
	}


	public boolean getCanBeRun()
	{
		return canBeRun;
	}

	public void setCanBeRun(boolean canBeRun)
	{
		this.canBeRun = canBeRun;
	}

	public String getTeam()
	{
		return team;
	}

	public void setTeam(String team)
	{
		this.team = team;
	}

	public Set<Schedule> getSchedules()
	{
		return schedules;
	}

	public void setSchedules(Set<Schedule> schedules)
	{
		this.schedules = schedules;
	}

	public Integer getReportId()
	{
		return reportId;
	}

	public void setReportId(Integer reportId)
	{
		this.reportId = reportId;
	}

	public List<Parameter> getParameters()
	{
		return parameters;
	}

	public void setParameters(List<Parameter> parameters)
	{
		this.parameters = parameters;
	}

	public boolean isCritical()
	{
		return critical;
	}

	public void setCritical(boolean critical)
	{
		this.critical = critical;
	}
	
}
