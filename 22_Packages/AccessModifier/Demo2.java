import mypack1.Demo1;
// This is Outside the package.
public class Demo2
{
	public static void main(String args[])
	{
		Demo1 d1 = new Demo1();
		d1.display();
		
		
		//System.out.println(d1.a+d1.b+d1.c+d1.d);
		// d1.a is default is accessable in only same package.
		
		//d1.b is private is accessable in only same class.
		
		//d1.c is protected is accessable only in same package and extends subclass only.
		
		
                                               ^
	}
}