
public class test
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {
        ArrayStack s = new ArrayStack();
        // add a few elements
        s.push(new Integer(1));
        s.push(new Integer(2));
        s.push(new Integer(3));
        s.push(new Integer(4));
        while (!s.isEmpty()) // display & remove all elements
        {
            System.out.println(" Top element is " + s.peek());
            System.out.println(" Removed the element" + s.pop());
        }
    }
}
