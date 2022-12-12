
import java.util.*;

public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>(List.of(10,20,30,40,50));
//		Add Element at end;
		al.add(10);
//		Error 
//		al.add('K');
//		Add Element at specfied Index
		al.add(0,15);
//		Add ArrayList2 to ArrayList1
		al.addAll(al2);
//		Add ArrayList2 to ArrayList at Spefifed Index;
		al.addAll(1,al2);
//		Return true if value 10 presents in al ArrayList.
		System.out.println(al.contains(10));
//		remove value at index 10 
		System.out.println(al.remove(10));
//		Allvalue present in al2 will remove from al ;
//		System.out.println(al.removeAll(al2));
//		if all values from al present in 
//		System.out.println(al.remove(al2));
		System.out.println(al);
//		Size of ArrayList.
		System.out.println(al.size());
		
//		Iterator - I
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
//		Iterator -II
//		for(Integer val:al)
//		{
//			System.out.println(val);
//		}
		
//		Iterator-III by Iterator.
//		Iterator<Integer> it = al.iterator();
//		while(it.hasNext())
//		{
//			System.out.print("**");
//			System.out.println(it.next());
//		}
		
//		Iterator -IV (ListIterator)
//		ListIterator<Integer> it = al.listIterator();
//		while(it.hasNext())
//		{
//			
//			System.out.println(it.next());
//		}
		
//		Iterator -V (LIST Iterator by for loop instead of while)
		
//		for(ListIterator<Integer> li = al.listIterator();li.hasNext();)
//		{
//			System.out.println("* "+li.next());
//		}
		
//		iterator - VI
		
		al.forEach(x-> System.out.println("+" +x));
		
		// Calling method by using forEach()
		al.forEach(x-> Show());
		
	}
	
	static void Show(int x)
	{
		System.out.println("Heelo "+x);
	}
}
