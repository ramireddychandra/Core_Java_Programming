
import java.lang.*;


class MyObject
{
    public String toString()
    {
        return "My Object";
    }
    
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
   
}

public class ObjectClass 
{
    public static void main(String[] args) 
    {
		//Object is parent for all Classes in Java
		//Before overriding o1 and o2 is false.
		//We can Override hashCode,equals,toString();
		//notify, await is final so cannot override;
		
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        System.out.println(o1.equals(o2));
		System.out.println(o1.hashCode());
		System.out.println(o1); //My object
    }    
}