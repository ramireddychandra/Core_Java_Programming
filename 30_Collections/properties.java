import java.io.*;
import java.util.*;
public class properties {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("username");
		System.out.println(s);
		p.setProperty("email", "ramireddy.reddy@highradius.com");
		FileOutputStream fos  = new FileOutputStream("abc.properties");
		p.store(fos, "updated by chandu");
		System.out.println(p);

	}

}
