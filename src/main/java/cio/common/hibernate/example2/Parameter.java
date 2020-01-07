package cio.common.hibernate.example2;

import java.io.Serializable;

public class Parameter implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer parameterId;
 	
	private String name;

	private String type;

	private String value;

	private Report report;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public Report getReport()
	{
		return report;
	}

	public void setReport(Report report)
	{
		this.report = report;
	}

	public Integer getParameterId()
	{
		return parameterId;
	}

	public void setParameterId(Integer parameterId)
	{
		this.parameterId = parameterId;
	}

	

}
