import java.util.*;
import java.io.*;


public class CallBack
{
	static FileInputStream fi;
	static Scanner sc;
	static void readFile() throws Exception
	{
		fi = new FileInputStream("D:\\GIT_hub_projects\\Core_Java_Programming\\23_Exceptions\\Demo.txt");
		sc = new Scanner(fi);
                try{
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
               
                    System.out.println(a/c);
                    System.out.println(a+b+c);
                }
                finally{
                    fi.close();
                    sc.close();
                }   
	}
	public static void main(String args[]) 
	{
            try{
		readFile();
            }
            catch(Exception e)
            {
                System.out.println(e);
				
				//sc scanner has been closed can not use sc Scanner.
                //sc.nextInt();
                //int d = sc.nextInt();
                //System.out.println(d);
            }
	}
}