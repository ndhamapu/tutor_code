package cio.primer.collection;

/**
 * Write a description of class sBuffer here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringBufferTest
{

	public static void main(String args[])
	{
		String str = "study";
		String str4 = "tonight";
		str.concat(str4);
		System.out.println(str);

		StringBuffer strB = new StringBuffer("study");
		strB.append(" tonight");
		System.out.println(strB);
		String str1 = new StringBuffer().append("Hello").append("World").toString();
		System.out.println(str1);

	}

}
