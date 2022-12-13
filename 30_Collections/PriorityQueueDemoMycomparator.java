
import java.util.*;
class Mycom implements Comparator<Integer>
{
	public int compare(Integer a,Integer b)
	{
		if(a<b) return 1;
		if(a>b) return -1;
		return 0;
	}
}
public class PriorityQueueDemoMycomparator {
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Mycom());
		
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
//		pq.add(2);
		System.out.println(pq);
	}
}
