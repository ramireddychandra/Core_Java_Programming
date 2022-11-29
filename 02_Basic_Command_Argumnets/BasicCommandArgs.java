public class BasicCommandArgs
{
	public static void main(String args[])
	{
		
		System.out.println("Hello World");
		
		// compile code ---->   javac BasicCommandArgs.javac
		// JRE (JVM)  ------>   java BasicCommandArgs welcome chandu
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
	}
}