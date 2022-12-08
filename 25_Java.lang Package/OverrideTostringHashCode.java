
public class OverrideTostringHashCode
{
	int i;
        Demo(int i)
        {
            this.i = i;
        }
        public String toString()
        {
            return i+"";
        }
        public int hashCode()
        {
            return i;
        }
        
    public static void main(String args[])
    {
	Demo d = new Demo(10);
        Demo d1 = new Demo(100);
        //Case 1(Overrideen toString Method by default it will call toString() )
        System.out.println(d); //10
        System.out.println(d1);//100
        
        
        //Case 2  Overrideen Hashcode (converted to hexadecimal form)
        //System.out.println(d); //Demo@a (Hexa Form)
        //System.out.println(d1);//Demo@64 
        
		//Case 3 bydefault by hashcode
//        System.out.println(d); // Output - Demo@568db2f2


        
    }
}

