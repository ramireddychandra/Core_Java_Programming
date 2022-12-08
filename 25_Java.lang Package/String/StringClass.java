class StringClass
{
    public static void main(String args[]){
		//String is immutable so we cannot modify the String.
        String s = new String("Chandu");
        s.concat("Madhu");
        System.out.println(s);
    }
}