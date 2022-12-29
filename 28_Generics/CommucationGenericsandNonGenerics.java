import java.util.*;
public class demo
{
	public static void m1(ArrayList al)
	{
		al.add(10);
		al.add(20);
		al.add("Madhuri");
	}
	public static void CommucationGenericsandNonGenerics(String args[])
	{
		ArrayList<String> as = new ArrayList<String>();
		as.add("Chandu");
		as.add("Madhu");
//		as.add(10);
		m1(as);
		
		Iterator i = as.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
	}
}