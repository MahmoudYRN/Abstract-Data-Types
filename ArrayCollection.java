/**
 * Write a description of class ArrayCollection here.
 *
 * @author (Mahmoud Mohamed)
 * @version (a version number or a date)
 */
public interface ArrayCollection
{
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public int indexOf(Object obj);
    public void add(int index, Object obj);
    public Object remove(int index);
    public String outputList();    
}
