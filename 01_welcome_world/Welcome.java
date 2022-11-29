// This import is manditory and this is by default imported.
import java.lang.*;

//Try to Use Class Name First Letter as Capital letter 
class Welcome
{
	//" is used because, Public means we can access from anywhere outside of class. So if we run JVM (java FileName) on CMD, It search for main method if it public then it can find main method.
	
	//"STATIC" If You want use anything from class without creating Object, Then that methiod should be static.
	
	//In JAVA we use "void as a return type its manditory"
	
	//"String args[]  ---> s the command line arguments... We will disuss later in the coourse

	public static void main(String args[])
	{
		// println is the method used to println
		// println method is inside of "OUT" Object
		// Out Object is related to System Class 
		
		// i.e class Name startsWith Capital Letter.
		// Method has ---> () i.e main();
		// System Class imported Automatically.
		System.out.println("Welcome Java World");
	}
}