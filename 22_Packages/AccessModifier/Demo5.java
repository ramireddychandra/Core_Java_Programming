package mypack2;
import mypack1.Demo1;

public class Demo5 extends Demo1
{
	public void show()
	{
		// a is default access only in same package but this is differnet package.
		//d is private so not added.
		System.out.println(a+b+c+d);
	}
}