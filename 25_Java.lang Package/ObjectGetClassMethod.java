import java.lang.reflect.*;
class ObjectGetClassMethod
{
    public static void main(String args[])
    {
        Object o = new String("Chandu");
//        Object o1 = new Integer(10);
        Class c = o.getClass();
        System.out.println(c);
        Method[] m = c.getDeclaredMethods();
        for( Method x : m)
            System.out.println(x.getName());
    }
}