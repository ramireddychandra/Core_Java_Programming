
import java.util.*;

public class VectorDemo {
	public static void main(String args[])
	{
		Vector al = new Vector();
		System.out.println(al.capacity());
		for (int i =1;i<10;i++)
		{
			al.addElement(i);
		}
		System.out.println(al.capacity());
		al.addElement('A');
		al.addElement('A');
		System.out.println(al.capacity());
	}
}