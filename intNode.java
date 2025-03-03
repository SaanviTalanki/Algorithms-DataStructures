public class intNode
{
    private int value;
    private intNode next;
    public intNode(int val)
    {
        value = val;
        next = null;
    }
    public intNode ()
    {
        value=0;
        next = null;
    }
    public intNode (int val, intNode n)
    {
        value = val;
        next = n;
    }
    public int getValue ()
    {
        return value;
    }
    public intNode getNext()
    {
        return next;
    }
    public void setValue (int v)
    {
        value = v;
    }
    public void setNext (intNode i)
    {
        next = i;
    }
}