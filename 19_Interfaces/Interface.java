
interface Test
{
     void meth1();
     void meth2();
}

class My implements Test
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
	 public void meth3(){System.out.println("Meth3");}
}
public class Interface 
{
    public static void main(String[] args) 
    {
		Test t2 = new My();
		t2.meth1();
		t2.meth2();  
    }
}