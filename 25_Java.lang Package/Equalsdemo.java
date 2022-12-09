
public class Equalsdemo
{
    String name ;
    int roll;
    Demo(String name,int roll)
    {
        this.name = name;
        this.roll = roll;    
    }
	public boolean
    public static void main(String args[])
    {
	Demo d = new Demo("chandu",10);
        Demo d1 = new Demo("Madhu",100);
        Demo d2 = new Demo("chandu",10);
        Demo d3 = d;
        
       System.out.println(d.equals(d3)); 
       System.out.println(d.equals(d1));
       System.out.println(d.equals(d2));
    }
}