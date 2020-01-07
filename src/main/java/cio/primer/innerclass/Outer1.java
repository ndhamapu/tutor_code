package cio.primer.innerclass;
class Outer1{
private int pnum;
private String name;
	static class Nest1{
		private String address;
		public void accept(String ar)
		{
			Outer1 ot=new Outer1();
			ot.name=ar;
		}
	}
	public void display()
	{
		System.out.println("The name is "+name);
	}

}

class TestNest{
	public static void main(String args[])
	{
		Outer1 a = new Outer1();
		Outer1.Nest1 b = new Outer1.Nest1();
		b.accept(args[0]);
		a.display();
	}
}
