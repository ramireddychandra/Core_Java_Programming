
import java.util.*;
public class demo {
    public static void main( String args[] ) {
    	HashMap m = new HashMap();
    	m.put("Chandu", 100);
    	m.put("Madhu", 500);
    	m.put("Jyothi", 50);
    	m.put("VaraLaxshmi", 600);
    	m.put("RamaKrishna",200);
    	System.out.println(m);//{RamaKrishna=200, Jyothi=50, Madhu=500, Chandu=100, VaraLaxshmi=600}
    	System.out.println(m.put("Chandu", 800)); //100
    	System.out.println(m);//{RamaKrishna=200, Jyothi=50, Madhu=500, Chandu=800, VaraLaxshmi=600}
    	Set ks = m.keySet();
    	Set es = m.entrySet();
    	System.out.println(ks);//[RamaKrishna, Jyothi, Madhu, Chandu, VaraLaxshmi]
    	System.out.println(es);// [RamaKrishna=200, Jyothi=50, Madhu=500, Chandu=800, VaraLaxshmi=600]
    	Iterator i = es.iterator();
    	while(i.hasNext())
    	{
    		Map.Entry e = (Map.Entry) i.next();
    		System.out.println(e.getKey()+ "---"+ e.getValue()); //RamaKrishna---200 etc..
    		if(e.getKey().equals("Madhu"))
    		{
    			e.setValue(10000);
    		}
    	}
    	System.out.println(m); //{RamaKrishna=200, Jyothi=50, Madhu=10000, Chandu=800, VaraLaxshmi=600}
    }
}