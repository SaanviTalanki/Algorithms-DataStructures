public class nodeTest
{
    public static void main (String [] args)
    {
        intNode n1 = new intNode(1, null);
        intNode n2 = new intNode(2, null);
        intNode n3 = new intNode(3, null);
        intNode n4 = new intNode(4, null);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        System.out.println(n1.getNext().getValue());
        System.out.println(n1.getNext().getNext().getValue());
        System.out.println(n1.getNext().getNext().getNext().getValue());
        intNode curr = n1;
        System.out.println(curr);
        curr=n1.getNext();
        while(curr.getNext() != null)
        {
            System.out.println(curr);
            curr.setNext(curr.getNext());
        }
    }
}