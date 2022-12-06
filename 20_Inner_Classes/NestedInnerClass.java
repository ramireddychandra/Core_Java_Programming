
class Outer
{
	int x = 10;
	
	class Inner
	{
		int y = 5;
		public void InnerMethod()
		{
			System.out.println("InnerMethod "+ x);
			System.out.println("InnerMethod "+ y);
		}
	}
	public void OuterMethod()
	{
		Inner i = new Inner();
		System.out.println("Outer Method "+i.y);
		i.InnerMethod();
	}
}


class NestedInnerClass
{
	public static void main(String args[])
	{
		//Outer o = new Outer();
		//System.out.println("OuterMethod " +o.x);
		//o.OuterMethod();
		
		//Dirctly we can call the innerClass
		
		Outer.Inner oi = new Outer().new Inner();
		//System.out.println(oi.x);
		System.out.println(oi.y);
		
	}
}
