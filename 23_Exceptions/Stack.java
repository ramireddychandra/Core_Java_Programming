class StackOverFlowException extends Exception
{
    public String toString()
    {
        return "Stack is Full ! ";
    }
}

class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "Stack is Empty ! ";
    }
}
class Stack
{
    private static int size;
    private int top = -1;
    private int st[];
    
    public Stack(int sz)
    {
        size = sz;
        st = new int[sz];
    }
    
    public void push(int ele) throws StackOverFlowException
    {
        if (top == size-1)
            throw new StackOverFlowException();
        top++;
        st[top] = ele;
    }
    
    public int pop() throws StackUnderFlowException
    {
        if (top == -1)
            throw new StackUnderFlowException();
        int rt = st[top];
        top--;
        return rt;
        
    }
    
    public int GetSize()
    {
        return size;
    }
     public int top()
    {
        return top;
    }
    public void PrintStack()
    {
        for(int x:st)
            System.out.println(x);
    }
    
}


public class Stack{
    public static void main(String args[])
    {
        Stack s = new Stack(5); 
        try{
            
            System.out.println(s.GetSize());
            s.push(25);
            s.push(12);
            s.push(5);
            s.push(2);
            s.push(22);
            s.push(205);
            System.out.println(s.top());
            s.PrintStack();
        }
        catch(Exception e)
        {
            System.out.println(e);
//            System.out.println(s.top());
        }
       
    }
}