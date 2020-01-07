package cio.primer.collection;

import java.util.*;


class AfreenHashTable
{
		public static void main(String[] ar)
		{
		String name;
		Double sal;
		int i;
		Scanner in=new Scanner(System.in);
		
		Hashtable<String, Double> ht=new Hashtable<String, Double>();
		
		System.out.println("enter the total number of employees");
		int n=in.nextInt();
		System.out.println("enter name and sal");
		for(i=0;i<n;i++)
		{
			name=in.next();
			sal=in.nextDouble();
			ht.put(name,sal);
		}//for
		
		Enumeration keys=ht.keys();
		
		double max=0;
		
		while(keys.hasMoreElements())
		{
			String key=(String) keys.nextElement();
			Double value=ht.get(key);
			System.out.println(key +" "+value);
				
			if(max<value.doubleValue())
			{
				max=value.doubleValue();	
			}//if
				
		}//while
		System.out.println("Maximum sal=" +max);

		}//main

}//class
