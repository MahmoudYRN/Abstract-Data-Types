/**
 * Write a description of class ArrayList here.
 *
 * @author (Mahmoud Mohamed)
 * @version (2021.11.22)
 */
public class ArrayList implements ArrayCollection
{
    protected Object[] arrayList; //Stores the object in an array
    protected int size; //The amount of elements in the arrayList array
    
    public ArrayList(){
        arrayList = new Object [20];// creating new array with index of 20
    }
    
    public ArrayList(int n)
    {
        if (n <1 )//creates an array with specified size
            throw new IllegalArgumentException
                ("The size must be greater than or equal to 1");
        arrayList = new Object [n];
    }
    
    public boolean isEmpty()
    {
        return size == 0; //returns if the array is empty or not
    }
    
    public int size()
    {
        return size; // returns the current size of the array
    }
    
    public void checkIndex (int index)
    {// checks the index and returns the object inside
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                ("index = " + index + " size = " + size);
    }
    
    public Object get(int index)
    {
        checkIndex(index);
        return arrayList[index];
    }
    
    public int indexOf(Object element)
    {
        for (int i = 0; i < size; i++)
        if (arrayList[i].equals(element))
        
        return i;
        
        return -1;
    }
    
    public Object remove(int index)
    {
        checkIndex(index);
        Object removedElement = arrayList[index];
        for (int i = index + 1; i < size; i++)
            arrayList[i-1] = arrayList[i];
            
        arrayList[--size] = null;
        return removedElement;
    }
    
    public void add(int index, Object theElement)
    {
        checkIndex(index);
        
        if (size == arrayList.length)
        {
            Object[] newArray = new Object[arrayList.length*2];
            System.arraycopy(arrayList,0,newArray,0,arrayList.length);
            arrayList = newArray;
            
            for(int i = size - 1; i >= index; i--)
                arrayList[i + 1] = arrayList[i];
            arrayList[index] = theElement;
            size++;
        }
    }
    
    public String outputList()
    {
        StringBuffer str = new StringBuffer("[");
        for(int i = 0; i < size; i++)
            if(arrayList[i] == null)
                str.append("null, ");
            else
                str.append(arrayList[i].toString() + ", ");
        
        if(size > 0)
            str.delete(str.length() - 2, str.length());
        str.append("]");
        return new String(str);
    }
}