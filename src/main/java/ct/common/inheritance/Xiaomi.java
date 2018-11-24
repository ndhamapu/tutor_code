package ct.common.inheritance;

public class Xiaomi extends AndroidMobile
{

	/**
	 * See the Green Arrow in the Method Name Line, its Eclipse way of Saying this
	 * method is Overriding method from SuperClass.
	 * <p>
	 * This is also true in Libraries, if we write a Class which no is used by
	 * everyone and now we want to optimize or fix the bug that may be present in a
	 * method.
	 * <p>
	 * one option is to use method override create a Class extending existing Class
	 * and Add new implementation of the class, the result will be the method from
	 * the New implementation will get called
	 */
	public void startup()
	{
		System.out.println("Show Mi6 Logo");
	}

	
	public void browseInternet()
	{
		System.out.println("browsing Internet in Xiaomi.");
		secretlySendDataToChina();
	}
	/**
	 * This functionality is Hidden We don't want anyone to know it.
	 * This is Private method Unlike Public
	 */
	private void secretlySendDataToChina()
	{
		System.out.println("Additional feature. Dont let Android know What we Do. Send usage info to China.!!");
	}
	
	public void browseInternetWithCompression()
	{
		System.out.println("browsing Internet with compression in Xiaomi.");
		secretlySendDataToChina();
	}
}
