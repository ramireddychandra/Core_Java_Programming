
class Literals{

	public static void main(String args[])
	{
		
		//Z = 5*x + 6*y; //  INT Literals

		//int x = 5  // int literal

		//char c = 'R'  //character

		//String s = "chandu"   // String class, chandu is Object, s in  

		// Decimal -0-9
		// Binary  1,0
		//octal 0,1,2,3,4,5,6,
		//HexaDecimal 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f

		//code

		// byte b = 10  // Integer form
		//byte b = 0b1010;  Binary Form 
		
		byte b1 = 10;
		byte b2 = 0b1010;
		byte b3 = 012;
		byte b4 = 0xa;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		long l =9999999999L;   // denotes L as Long at end of literal.
		System.out.println(l);
		
		long l1 = 2_564_546_464_644L;   // If the literal is too long then we can seperate by "_" symbol.
		
		System.out.println(l1);
	}

}