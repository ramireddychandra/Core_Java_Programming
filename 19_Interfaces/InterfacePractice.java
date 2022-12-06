
interface Test
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
	
	//if you want to use body inside interface use static keyword.
	// We can also write default void meth3(){};
	
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);  //Static value can call by interfac name.
		
		// Static method can call by "."
		
        Test.meth3();
        
    }
}