package cio.common.adv.concurrent.prodncon;

/**
 * @author Nikhil Sample messenger Object - the pay load
 */
public class MyRequest
{

	private String url;

	private RequestType type;

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public RequestType getType()
	{
		return type;
	}

	public void setType(RequestType type)
	{
		this.type = type;
	}
}
