package mypack2;
import mypack1.Demo1;

public class Demo5 extends Demo1
{
	public void show()
	{
		//d is private so not added.
		System.out.println(a+b+c+d);
	}
}