package cio.common.hibernate.example2;

import java.time.LocalTime;
import java.util.Set;

public class Schedule
{

	private Integer scheduleId;

	private LocalTime time;

	private String zone;

	private Set<Report> reports;

	private Boolean runOnMon;
	private Boolean runOnTue;
	private Boolean runOnWed;
	private Boolean runOnThu;
	private Boolean runOnFri;
	private Boolean runOnSat;
	private Boolean runOnSun;

	public Integer getScheduleId()
	{
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId)
	{
		this.scheduleId = scheduleId;
	}

	public LocalTime getTime()
	{
		return time;
	}

	public void setTime(LocalTime time)
	{
		this.time = time;
	}

	public String getZone()
	{
		return zone;
	}

	public void setZone(String zone)
	{
		this.zone = zone;
	}

	public Set<Report> getReports()
	{
		return reports;
	}

	public void setReports(Set<Report> reports)
	{
		this.reports = reports;
	}

	public Boolean getRunOnMon()
	{
		return runOnMon;
	}

	public void setRunOnMon(Boolean runOnMon)
	{
		this.runOnMon = runOnMon;
	}

	public Boolean getRunOnTue()
	{
		return runOnTue;
	}

	public void setRunOnTue(Boolean runOnTue)
	{
		this.runOnTue = runOnTue;
	}

	public Boolean getRunOnWed()
	{
		return runOnWed;
	}

	public void setRunOnWed(Boolean runOnWed)
	{
		this.runOnWed = runOnWed;
	}

	public Boolean getRunOnThu()
	{
		return runOnThu;
	}

	public void setRunOnThu(Boolean runOnThu)
	{
		this.runOnThu = runOnThu;
	}

	public Boolean getRunOnFri()
	{
		return runOnFri;
	}

	public void setRunOnFri(Boolean runOnFri)
	{
		this.runOnFri = runOnFri;
	}

	public Boolean getRunOnSat()
	{
		return runOnSat;
	}

	public void setRunOnSat(Boolean runOnSat)
	{
		this.runOnSat = runOnSat;
	}

	public Boolean getRunOnSun()
	{
		return runOnSun;
	}

	public void setRunOnSun(Boolean runOnSun)
	{
		this.runOnSun = runOnSun;
	}

}
