
import java.util.*;
public class EnumerationDemo {
	public static void main(String args[])
	{
		Vector  al = new Vector();
		System.out.println(al.capacity());
		for (int i =1;i<10;i++)
		{
			al.addElement(i);
		}
		System.out.println(al.capacity());
//		Applicable for lagacy class.
		Enumeration e =al.elements();
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			System.out.println(i);
			}
	}
}