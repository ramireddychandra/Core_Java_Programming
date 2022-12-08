import java.util.*;
class toStringClass
{
    public String name;
    public long roll;
    public toStringClass(String name,long roll)
    {
        this.name = name;
        this.roll = roll;
    }
	
	//Bydefault.
	
    //public String toString()
	//{
	//	return getClass().getName()+"@"+Integer.toHexString(hashCode());
	//}
	
	public String toString()
	{
		return this.name+"\n "+this.roll;
	}
	
    public static void main(String args[])
    {
        toStringClass c = new toStringClass("Chandu",11902848);
        System.out.println(c);
        System.out.println(c.toString());
		
	
    }
}

