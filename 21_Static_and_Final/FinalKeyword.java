
public class FinalKeyword {
    //#case 1  When we declare Final Variable as Class Member then we have intilize directly by below.
    final int aa = 5;
    
    //#case 2  Below code is not possiable
    
    /*
    final int x;
    x=25;
    */
    
    //#case 3 We can use under Instance block
    
    final int kk;
    
    //Instance block allowed.
    {
        kk = 55;
    }
    
    //#Case 4 Inside static block is used but variable should also be static
    
    static final int zk;
    
    //Instance block allowed.
    static{
        zk = 55;
    }
    
    // Case 5 Inside Constructor also We can perform
    
    final int sc;
    
    public FinalKeyword()
    {
        sc = 101;
    };
    
    public static void main(String[] args) {
        
        final float PI;
        PI=3.1425f;
        System.out.println(PI);
        
    }
    
}