public class arrival
{
    private Customer head;
    private Customer tail;
    public arrival()
    {
        head = null;
        tail = null;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public void addCustomer(int aT, int sT, String n)
    {
        Customer c = new Customer (aT, sT, n);
        if (head == null)
        {
            head = c;
        }
        tail = c;
    }
    public void removeCustomer()
    {
        if(!isEmpty())
        {
            head = head.getNext();
        }
    }
    public Customer nextCustomer()
    {
        return head;
    }
    public void displayArrivalList()
    {
        Customer c = head;
        while (c.getNext() != null)
        {
            System.out.print(c.getArrivalTime()+" ");
            System.out.print(c.getServiceTime()+" ");
            System.out.println(c.getNext());
            c = c.getNext();
        }
    }
    public static void main (String [] args)
    {
        
    }
}