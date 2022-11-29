class RulesVariables
{
	public static void main(String args[])
	{
		//-1-Case Sensitive
		int a = 10;
		int A = 20;
		
		System.out.println(a +" " + A);
		
		//-2-Containg Alphbets, Numbers, _ , $
		
		String name = "chandu";
		// name123, first_name,last$name,
		
		//-3- Start with Alphbet, _ $
		
		String $Name = "Ramireddy";
		System.out.println($Name);
		
		String _Name = "Ramr";
		System.out.println(_Name);
		
		//-4- Should not be a keyword
		//String class = "Kiran";    //ERROR
		//System.out.println(class);
		
		// -5- Should not be a class name, if class is also in use.
		
		//-6-No Limit on length of Name
		
		//-7- Follow Camel Case .
		
	}
}