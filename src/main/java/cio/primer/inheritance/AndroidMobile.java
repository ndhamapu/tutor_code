package cio.primer.inheritance;
/**
 * This Class represents a Parent Class that represents Android Mobile
 * 
 * @author nikhil
 *
 */
public class AndroidMobile
{

	public void startup()
	{
		System.out.println("Show google Logo Plain Andriod.");
	}
	
	/**
	 * This method represents a feature that is by default present in Android OS
	 * any company like Samsung or Xiaomi doesn't want to adds its feature. Itw ill ue the Existing feature from
	 * parent.
	 */
	public void pinchEffect()
	{
		System.out.println("Minimize - zoom out effect, Android has added it.");
	}
	
	public void browseInternet()
	{
		System.out.println("browsing Internet in Android.");
	}
}
