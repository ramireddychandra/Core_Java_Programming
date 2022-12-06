
class Outer
{
	int x = 10;
	static int y = 20;
		static class Inner
		{
			public void display()
			{
				//Only Static variable can access.
				System.out.println(" " + y);
			}
		}
	
}

class StaticClass
{
	public static void main(String args[])
	{
		
		Outer.Inner i = new Outer.Inner();
		i.display();
	}
}