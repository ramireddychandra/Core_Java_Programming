
public class NestedTryCatch 
{
    public static void main(String[] args) 
    {
        int arr[] = {80,0,30,40,50};
        try
        {
            try{
                int c = arr[0]/arr[1];
                System.out.println(c);
            }
            catch(ArithmeticException e )
            {
                System.out.println("Dont "+e.getMessage());
            }
            System.out.println(arr[5]);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    } 
}