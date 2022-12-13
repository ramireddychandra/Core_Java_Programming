
import java.util.*;

public class StackDemo {
	public static void main(String args[])
	{
     	Stack  al = new Stack();
		System.out.println(al.capacity());
		for (int i =1;i<10;i++)
		{
			al.push(i);
		}
		System.out.println(al.capacity());
		al.addElement('A');
		
//		System.out.println(al.capacity());
		al.pop();
		System.out.println(al.peek());
		System.out.println(al);
		al.addElement(8);
		System.out.println(al);
//		return 1 if found else -1
		System.out.println(al.search(10));
	}
}
