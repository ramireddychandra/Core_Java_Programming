import java.util.Scanner;
import java.lang.*;

class keybRead
{
	public static void main(String args[])
	{
		//Scanner ---> Class 
		//new Scanner() is constructor.
		//sc is referne Variable ...
		
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter the First Number : ");
		a = sc.nextInt();
		System.out.println("Enter the Second number : ");
		b = sc.nextInt();
		
		//nextInt()    Read Int Value
		//nextFloat()
		//nextDouble()
		//next()     // Read Single String Word
		//nextLine()   // Read Sentence ---> multiple words.
		
		//nextByte()
		//nextShort()
		//nextLong()
		//nextBoolean()
		
		//hasNextInt()   	Boolean results, If has next elemet is int then True;
		//hasNextFloat()  	Boolean results
		
		c = a + b;
		System.out.println("************************************** ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

