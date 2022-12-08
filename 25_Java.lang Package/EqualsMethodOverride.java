
public class EqualsMethodOverride
{
    String name ;
    int roll;
    EqualsMethodOverride(String name,int roll)
    {
        this.name = name;
        this.roll = roll;    
    }
    public boolean equals(Object obj)
    {
		
		//Case 1
//        try
//        {
//            EqualsMethodOverride dd = (EqualsMethodOverride)obj;
//            if(this.name.equals(dd.name) && this.roll == dd.roll)
//             {
//                    return true;
//             }
//            else{
//                    return false;
//            }
//        }
//        catch(ClassCastException e)
//        {
//                return false;
//        }
//        catch(NullPointerException e)
//        {
//                return false;
//        }

// CASE -II
		if( obj ==this)
		{
			return true;
		}
		if (obj instanceof EqualsMethodOverride)
		{
			EqualsMethodOverride dd = (EqualsMethodOverride)obj;
			if(name.equals(dd.name) && roll == dd.roll)
			 {
					return true;
			 }
			else{
					return false;
				}
		}
		return false;
    }
	
	//----------------------------------------------
    public static void main(String args[])
    {
	EqualsMethodOverride d = new EqualsMethodOverride("chandu",10);
        EqualsMethodOverride d1 = new EqualsMethodOverride("Madhu",100);
        EqualsMethodOverride d2 = new EqualsMethodOverride("chandu",10);
        EqualsMethodOverride d3 = d;
        
       System.out.println(d.equals(d3)); //true
       System.out.println(d.equals(d1));  //false
       System.out.println(d.equals(d2)); //true
	   //System.out.println(d.equals("chandu"); // ClasscastException.
    }
}

