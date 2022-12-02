
import java.lang.*;
import java.util.*;
public class Amrstrong {

    /*Display Digits of number
    
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=scan.nextInt();
       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;
        System.out.println(r);
       }
        System.out.println(n);
    }
*/
    
    
    /* Count Digits Of a Number
    
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=scan.nextInt();
       int count=0;
       while(n>0)
       {
        n=n/10;
        count++;
       }
        System.out.println(count);
    }
    */
    
   
    /* armstrong number*/
    /*
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();
       
       int m=n;
       int sum=0;
       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;
        
        sum=sum+r*r*r;
       }
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armsttrong Number");
        
    }
	*/
	
	/*
	public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=scan.nextInt();
	   int rev = 0;
	   int rem;
	   
       while(n>0)
       {
		rem = n%10;
        n=n/10;
		rev = rev*10+rem;
        
       }
        System.out.println(rev);
    }
	*/
	
	public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number is Palindrome or Not : ");
       int n=scan.nextInt();
	   int copy = n;
	   int rev = 0;
	   int rem;
	   
       while(n>0)
       {
		rem = n%10;
        n=n/10;
		rev = rev*10+rem;
        
       }
        if (rev == copy)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
    }
    
}