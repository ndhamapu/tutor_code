package ct.common.inheritance;

public class InheritanceTest
{

	public static void main(String[] args)
	{
		AndroidMobile parent = new AndroidMobile();

		parent.startup();
		parent.browseInternet();
		System.out.println("--------------------------------------------");

		Samsung samsung = new Samsung();
		samsung.startup();
		samsung.browseInternet();
		System.out.println("-err-----------------------------------------");

		Xiaomi xiaomi = new Xiaomi();
		xiaomi.startup();
		xiaomi.browseInternet();
		xiaomi.browseInternetWithCompression();
		System.out.println("--------------------------------------------");

		/**
		 * Method Overriding - the parent reference ends calling the Child Methods. the
		 * Child methods in class can be developed in futures, similar to new
		 * functionality or optimizations that get added as part of Method Calls
		 */
		AndroidMobile parentRef = new Xiaomi();
		parentRef.startup();
		parentRef.browseInternet();
		/**
		 * The method is not accessible via parent reference
		 */
		//parent.browseInternetWithCompression();

	}
}
