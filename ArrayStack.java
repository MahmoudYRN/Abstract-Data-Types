/**
 * Write a description of interface Stack here.
 *
 * @author (Mahmoud Mohamed)
 * @version (a version number or a date)
 */
import java.util.EmptyStackException; 

public class ArrayStack implements Stack
{ 
    protected Object[] stack; 
    protected int top;
    // declare varibles int and stack
    public ArrayStack(int initialCapacity)
    {//declaring the stack size
        if (initialCapacity < 1)
            throw new IllegalArgumentException
            ("initialCapacity must be >= 1");
        stack = new Object [initialCapacity];
        top = -1;  
    }
    
    public ArrayStack()
    {
        this(20);// this is the constructor and will create stack with size 20
    }

    public boolean isEmpty()
    {
        return top == -1;// will return true if the stack is empty
    }

    public Object peek()
    {
        try//this method will return the top of the stack
            {
            if (isEmpty())//it will check if the stack is 
            //empty then throws error if true
            {
                // throw new EmptyStackException();
                System.out.println("Stack is empty");
            }
        }
        catch(EmptyStackException e)
        {
            System.out.println(e);
        }
        return stack[++top];
    }
    
    public void push(Object object)
    {// this methods add object to the top of the stack
        if (top == stack.length - 1)
        {
            String [] newArray = new String[stack.length*2];
            System.arraycopy(stack, 0,newArray,0,stack.length);
            stack[top] = object;
        }
        stack[++top] = object;
        // System.out.println(stack[top]);
    } 
    
    public Object pop()
    {   
        // this method will remove the top element of the stack
        if (isEmpty())
        throw new EmptyStackException();
                Object object = stack[top];
        stack[top--] = null; // to allow garbage collection
        return object;// return the top element
    } 
    
    // public static void main(String[] args)
    // {
        // ArrayStack s = new ArrayStack();
        // // add a few elements
        // s.push(new Integer(1));
        // s.push(new Integer(2));
        // s.push(new Integer(3));
        // s.push(new Integer(4));
        // while (!s.isEmpty()) // display & remove all elements
        // {
            // System.out.println(" Top element is " + s.peek());
            // System.out.println(" Removed the element" + s.pop());
        // }
    // // }
}
