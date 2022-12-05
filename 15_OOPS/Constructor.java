
class Rectangle
{
    public double length;
    public double breadth;
    public Rectangle()
	{
		length = 1;
		breadth = 1;
	}
	public Rectangle(double l, double b)
	{
		length = l;
		breadth =b;
	}
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class Constructor {

    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
		Rectangle r2 =  new Rectangle(10.5,5.5);
       
        System.out.println("Area"+r1.area());
        System.out.println("perimeter"+r1.perimeter());
        
        System.out.println("Is it a Square"+r1.isSquare());
    
	 System.out.println("Area"+r2.area());
        System.out.println("perimeter"+r2.perimeter());
        
        System.out.println("Is it a Square"+r2.isSquare());
	}
    
}