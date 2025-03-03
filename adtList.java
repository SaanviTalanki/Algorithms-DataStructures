public class adtList
{
    public int length = 8;
    public int numItems = 0;
    public int[] list;
    public void createList()
    {
        list = new int[length];
    }
    public boolean isEmpty()
    {
        return (numItems == 0);
    }
    public int size()
    {
        return numItems;
    }
    public void addItem (int location, int item)
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
        list = new int[length];
        numItems = 0; 
    }
    public int getItem(int index)
    {
        return list[index];
    }
    public int linearSearch (int req)
    {
        for(int i = 0 ; i<=numItems ; i++)
        {
           if (getItem(i) == req)
           {
               return i;
           }
        }
        return -1;
    }
    public int binarySearch (int req)
    {
        for(int w = 0; w < numItems-1 ; w++)
        {
            for(int i = 0; i < numItems-w-1 ; i++)
            {
                if (getItem(i++)<getItem(i))
                {
                    int b = list[i];
                    int a = list[i++];
                    list [i] = a;
                    list [i++] = b;
                }
            }
        }
        int high = numItems;
        int low = 0;
        while (low < high)
        {
            int mid = (low+high)/2;
            if (getItem(mid) == req)
            {
                return mid;
            }
            else if (getItem(mid) > req)
            {
                high = mid-1;
            }
            else if (getItem (mid) < req)
            {
                low = mid+1;
            }
        }
        return -1;
    } 
}