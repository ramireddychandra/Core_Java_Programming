import java.util.*;
class toString
{	
    public static void main(String args[])
    {	
		//
        String s = new String("Chandu");
        //String class Already Overridden toString() to its Content.
        System.out.println(s);
        //
        Integer i = new Integer(10);
        System.out.println(i);
        //
        ArrayList al = new ArrayList();
        al.add('A');
        al.add('b');

        System.out.println(al);
    }
}
