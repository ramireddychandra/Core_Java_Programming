
abstract class my
{
	abstract void display();
}

class Outer
{
	public void meth()
	{
		my m = new my()
		{
			public void display()
			{
				System.out.println("Hello ");
			}
		};
		//Anonomus object reference Anonomus Class.
		//new my()
		//{
			//public void display()
			//{
				//System.out.println("Hello ");
			//}
		//}.display();
		m.display();
	}
	
}

class AnonomusClass
{
	public static void main(String args[])
	{
		Outer oo = new Outer();
		oo.meth();	
	}
}