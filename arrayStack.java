public class arrayStack
{
    public int numItems;
    public int[] stack;
    public int top;
    public int size;
    public void newStack(int len)
    {
        stack = new int[len];
        size = len;
        top = -1;
        numItems = 0;
    }
    public void newStack()
    {
        stack = new int[5];
        size = 5;
        top = -1;
        numItems = 0;
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
    public int size()
    {
        return size;
    }
    public void push(int n)
    {
        top++;
        stack[top] = n;
        numItems++;
    }
    public int pop()
    {
        if (top>=0)
        {
            top--;
            numItems--;
            return stack[top+1];
        }
        else 
        {
            return -1;
        }
    }
    public int peek()
    {
        return stack[top];
    }
    public void popAll()
    {
        top = -1;
    }
}