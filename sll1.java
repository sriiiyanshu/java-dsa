//create a singly linked list and print it
public class sll1
{
    private ListNode head;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int length()
    {
        if(head == null)
        {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null)
        {
            count ++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args)
    {
        sll1 obj = new sll1();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();
        System.out.println("Length of the linked list is: " + obj.length());
    }
}