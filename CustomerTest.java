public class CustomerTest
{
   public static void main (String [] args)
   {
       Customer one = new Customer (6,7,"Chris");
       Customer two = new Customer (7,8,"Steve",one);
       Customer three = new Customer (8,9,"John", two);
       System.out.println(one.getName());
       one.setName("Christopher");
       one.displayName();
       System.out.println(one.getServiceTime());
       one.setServiceTime(70);
       one.displayServiceTime();
       System.out.println(one.getArrivalTime());
       one.setArrivalTime(60);
       one.displayArrivalTime();
       System.out.println(one.getNext());
       one.setNext(three);
       System.out.println("The new next is customer " + one.getNext());
   }
}   