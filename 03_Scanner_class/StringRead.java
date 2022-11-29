import java.util.Scanner;

class StringRead
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter the Name");
		name = sc.nextLine();
		System.out.println("Your Name is : "+name);
	}
}