package ct.primer.collection;

/**
 * Write a description of class myHashSetStudent here.
 * The class will add duplicate objects if both the equals and hashCode
 * function are not overridden
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

class StudentClass
{
	String name;
	int rollNo;
	long mobile;

	StudentClass(String name, int rollNo, long mobile)
	{

		this.name = name;
		this.rollNo = rollNo;
		this.mobile = mobile;
	}

	public boolean equals(Object o)
	{
		System.out.println("Equals Method");
		if (this == o) {
			System.out.println("Object Equals");
			return true;
		}
		if (!(o instanceof StudentClass))
			return false;

		StudentClass their = (StudentClass) o;
		boolean retVal = false;
		System.out.println("this Name=" + this.name + " oname=" + their.name);
		if (this.name.equals(their.name) && this.rollNo == their.rollNo && this.mobile == their.mobile)
			return true;
		else
			return false;

	}

	public int hashCode()
	{
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + name.hashCode();
		return result;
	}

}

public class MyHashSetStudent
{

	public static void main(String args[]) throws IOException
	{
		HashSet<StudentClass> hs = new HashSet<StudentClass>();
		StudentClass std = new StudentClass("Tapan", 111, 69998);
		hs.add(std);
		StudentClass std1 = new StudentClass("David", 222, 79998);
		hs.add(std1);

		StudentClass std2 = new StudentClass("Raja", 333, 89998);
		hs.add(std2);
		std2 = new StudentClass("Raja", 333, 89998);
		hs.add(std2);

		/*
		 * hs.add(new Student("Raja", 333, 89998)); hs.add(new Student("Raja", 333,
		 * 89998));
		 */
		Iterator iter = hs.iterator();

		System.out.println("HashSet Size=" + hs.size());
		System.out.println(hs);
		while (iter.hasNext()) {
			std = (StudentClass) iter.next();
			System.out.println("name=" + std.name + " roll no=" + std.rollNo + " Mob=" + std.mobile);

		}
	}

}
