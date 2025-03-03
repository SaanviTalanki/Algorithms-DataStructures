public class list
{
    public int length = 8;
    public int numItems = 0;
    public char[] list;
    public void createList()
    {
        list = new char[length];
    }
    public list (int len)
    {
        list = new char[len];
        length = len;
        numItems = 0;
    }
    public boolean isEmpty()
    {
        return (numItems == 0);
    }
    public int size()
    {
        return numItems;
    }
    public void addItem (int location, char item)
    {
        if (location >= numItems) 
        {
            list[numItems] = item;
        }
        else
        {
            for (int i = location; i < length; i++)
            {
                list[i+1] = list[i];
            }
            list[location] = item;
        }
        numItems++;
    }
    public void addItem (char item)
    {
        list[numItems]=item;
        numItems++;
    }
    public void removeItem (int l)
    {
        list[l] = list[l+1];
          for(int z = l+1;z < numItems;z++)
        {
            list[z] = list[z+1];
        }
        list[numItems]=0;
        numItems--;
    }
    public void removeAll()
    {
        list = new char[length];
        numItems = 0; 
    }
    public int getItem(int index)
    {
        return list[index];
    }
    public void display ()
    {
        for (int i = 0; i<numItems ; i++)
        {
            System.out.print(list[i]);
        }
        System.out.println("");
    }
}