public class linkedList
{
    private intNode head;
    private int numItems;
    public linkedList()
    {
        head = null;
        numItems = 0;
    }
    public linkedList(intNode n)
    {
        head = n;
        numItems = 1;
    }
    public boolean isEmpty()
    {
        if(numItems == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int size()
    {
        return numItems;
    }
    public void add(intNode b)
    {
        if (head != null)
        {
            intNode curr = head;
            while(curr.getNext() != null)
            {
                curr = curr.getNext();
            }
            curr.setNext(b);
        }
        else
        {
            head = b;
        }
        numItems++;
    }
    public void remove(int ind)
    {
        if (head != null)
        {
            intNode curr = head;
            for(int i = 0; i<=ind-1; i++)
            {
                curr = curr.getNext();
            }
            curr.setNext(curr.getNext().getNext());
        }
    }
    public void removeAll()
    {
        head.setNext(null);
    }
    public intNode get(int ind)
    {
        intNode curr = head;
        if (head != null)
        {
            for(int i = 0; i<=ind; i++)
            {
                curr = curr.getNext();
            }
        }
        return curr;
    }
    public void display()
    {
        if (head != null)
        {
            intNode curr = head;
            while(curr.getNext() != null)
            {
                System.out.println(curr.getValue());
                curr = curr.getNext();
            }
        }
    }
}
