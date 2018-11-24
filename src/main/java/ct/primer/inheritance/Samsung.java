package ct.primer.inheritance;

public class Samsung extends AndroidMobile
{

	/**
	 * See the Green Arrow in the Method Name Line, its Eclipse way of Saying this method
	 * is Overriding method from SuperClass
	 */
	public void startup()
	{
		System.out.println("Show Samsung Logo");
	}
	
	public void browseInternet()
	{
		System.out.println("browsing Internet in Samsung Different Browser.");
	}
}