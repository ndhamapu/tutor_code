package cio.primer.others;

class Company
{
	String cname;
	String branch;

	Company()
	{
	}

	Company(String cname, String branch)
	{
		this.cname = cname;
		this.branch = branch;
	}

	public void display()
	{
		System.out.println("cname" + cname + " branch" + branch);
	}
}

class EmployeeClass extends Company
{
	int eid;
	String ename;

	EmployeeClass()
	{
	}

	EmployeeClass(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

	int computesal(int bsal, int hra)
	{
		int sal;
		sal = bsal + hra;
		return sal;
	}
}

class Manager extends EmployeeClass
{
	int aadd_sal;
	String mng_task;

	Manager()
	{
	}

	Manager(int aadd_sal, String mng_task)
	{
		this.aadd_sal = aadd_sal;
		this.mng_task = mng_task;
	}

	public static void main(String args[])
	{
		Manager m1 = new Manager(200, "Manage");// 121,"XYZ", 12000,"HR Management");
		m1.display();
	}
}