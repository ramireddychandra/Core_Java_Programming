
class Student <T>
{
	T var;
	Student(T var)
	{
		this.var = var;
	}
	public void show()
	{
		System.out.println(var.getClass().getName());
	}
	public T get()
	{
		return var;
	}
}
public class OwnGenericClass
{
	public static void main(String args[])
	{
		Student<String> d1 = new Student<String>("Chandu");
		d1.show();
		System.out.println(d1.get());
		
		Student<Integer> d2 = new Student<Integer>(11);
		d2.show();
		System.out.println(d2.get());
	}
}