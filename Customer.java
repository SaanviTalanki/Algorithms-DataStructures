public class Customer
{
    private int arrivalTime;
    private int serviceTime;
    private String name;
    private Customer next;
    public Customer (int at, int st, String n, Customer c)
    {
        arrivalTime = at;
        serviceTime = st;
        name = n;
        next = c;
    }
    public Customer (int at, int st, String n)
    {
        arrivalTime = at;
        serviceTime = st;
        name = n;
        next = null;
    }
    public int getArrivalTime()
    {
        return arrivalTime;
    }
    public void setArrivalTime(int t)
    {
        arrivalTime = t;
    }
    public void displayArrivalTime ()
    {
        System.out.println(this.getArrivalTime());
    }
    public int getServiceTime()
    {
        return serviceTime;
    }
    public void setServiceTime(int s)
    {
        serviceTime = s;
    }
    public void displayServiceTime ()
    {
        System.out.println(getServiceTime());
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void displayName()
    {
        System.out.println(getName());
    }
    public Customer getNext()
    {
        return next;
    }
    public void setnext(Customer c)
    {
        next = c;
    }
}
