
public class MultiCatchBlock 
{
    public static void main(String[] args) 
    {
        int arr[] = {80,0,30,40,50};
        try
        {
            // Case1
            
//        int c = arr[0]/arr[1];
//        System.out.println(c);
            
           //Casw 2
            
        System.out.println(arr[5]);
        
        }
        catch(ArithmeticException e )
        {
            System.out.println("Dont "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    } 
}