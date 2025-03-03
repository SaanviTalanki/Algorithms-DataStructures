public class refStack 
{
    public int numItems;
    public intNode top;
    public void newStack()
    {
        top = null;
        numItems = -1;
    }
    public void newStack(intNode n)
    {
        top = n;
        numItems = 0;
    }
    public boolean isEmpty()
    {
        return (numItems >= 0);
    }
    public int size()
    {
        return numItems++;
    }
    public void push(intNode n)
    {
        n.setNext(top);
        top = n;
        numItems++;
    }
    public intNode pop()
    {
        intNode f = top;
        top = top.getNext();
        numItems--;
        return f;
    }
    public intNode peek()
    {
        return top;
    }
    public void popAll()
    {
        while (top.getNext()!=null)
        {
            top = top.getNext();
        }
    }
}