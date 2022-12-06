class Outer
{
    public void OuterDisplay()
    {
        class Inner
        {
           int x= 10;
		   
           public void InnerDisplay()
		{
		System.out.println("Inner InnerDisplay " +x);
		}
			
			
		}
	Inner i= new Inner();
	System.out.println("Now Calling the Inner Method");
	i.InnerDisplay();
		
	}
}
public class LocalClass
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.OuterDisplay();
	}
}