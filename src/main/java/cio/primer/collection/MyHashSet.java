package cio.primer.collection;

/**
 * Write a description of class myHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class MyHashSet
{
    public static void main(String args[]) throws IOException
	{
		TreeSet<String> hs = new TreeSet<String>();
		String str;
		hs.add("Alok");hs.add("Tapan"); 
		hs.add("David"); hs.add("Wadia");
		hs.add("David"); hs.add("Ness"); hs.add("Ratan");

		Iterator iter = hs.iterator(); 		
		while (iter.hasNext()){ 
		     str = (String) iter.next();
		     System.out.println("name="+str);
		}
	}

}
