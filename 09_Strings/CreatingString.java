class CreatingString {
    
    public static void main(String[] args) {
		
        
        /*
		Step-1
        String str1="Java Program";
        System.out.println(str1);
		//JavaPrgram is Literal So it will create n String Pool and str1 is referening to that ..
		
        
		Step-2
        String str2=new String("JAVA");
        System.out.println(str2);
		//When new keyword is used the a Object is created in heap and String Literal will be in pool
		
        
		STEP-3
        char c[]={'H','e','l','l','o'};
        //String str3=new String(c);
        String str3=new String(c,1,3);  // 1 is Start index, 3 is numer of letters should Consider.
        System.out.println(str3);
        
		STep-4
        byte b[]={65,66,67,68};
        //String str4=new String(b);
        String str4=new String(b,1,2);
        System.out.println(str4);
        */
		
		//String str1="Java";
        //String str2="Java";
		// Here "Java" is String Literal and stored in the pool and str1 is refered to that "Java", Now We created a str2 has Same String, So same String Stroed in pool So str2 also reference to same String pool;
		//String str2=new String("Java");
		//Here it will create a new Object Again because we use new Keyword, So it will create in heap . and No literal will be created on pool because it is alredy Present over there.
		//If we Use new keyword then may be two Objects will be created, one is in Heap and Another one is in Pool;'
		
		
        
        String str1="Java";
        //String str2="Java";
        String str2=new String("Java");
        System.out.println(str1==str2);
    
		//STEP-1
		char c[] = [65,66,67,68];
		
        String str = new String("Hello"); 
		//String is CLass 
		//str is referance variable
		// new String Object
		// "hello" will be stored in String pool
		
        System.out.println(str);

    }
}