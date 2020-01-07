package cio.primer.others;

class ComArg 
{
	public static void main (String args[  ])
	{
		int count, i=0;
		String str;
		count = args.length;
		System.out.println("Number of arguments = " + count);
		while (i < count)
		{
			str = args[i];
			i = i + 1;
			System.out.println(i + " : " + "argument is " + str + "!");
		}
	}
}
