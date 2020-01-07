package cio.primer.others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Student
{
	int rollno, no_sub;
	String name;
	int[] marks;
	Student(int rno, String nam, int sub)
	{
		rollno=rno;
		name=nam;
		no_sub=sub;
	}
	

	void mrks() throws IOException
	{
        marks=new int[no_sub];
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String delims=" ";
		System.out.println("\nEnter marks of " +no_sub+ " subjects");
		String strline1=in.readLine();
		String[] tokens=strline1.split(delims);
		for(int j=0;j<no_sub;j++) 
		{
			marks[j]=Integer.parseInt(tokens[j]);
		}
			
	}
	
	void calc()
	{
		float sum=0;
		float res;
		for(int i=0;i<no_sub;i++)
		{
			sum+=marks[i];
		}
		res= ((sum)/(no_sub*100))*100;	
                                System.out.println("\nRoll No. " +rollno+ " Name: " +name+ " No. of subject " +no_sub);
		for(int i=0;i<no_sub;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("Percent" +res);
		if(res>=90)
			System.out.println("Class A");
		else if(res>=80 && res<90)
			System.out.println("Class B");
		else if(res>=70 && res<80)
			System.out.println("Class C");
		else
			System.out.println("Class D");
	}	
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String delims=" ";
		Student arr[];
		arr=new Student[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("\nEnter rollno, name, no. of subjects");
			String strline=in.readLine();
			String[] tokens=strline.split(delims);
			Student s1=new Student(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2]));
			arr[i]=s1;
			arr[i].mrks();
			arr[i].calc();	
		}
	}
}