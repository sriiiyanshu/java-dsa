//reverse singly linked list
public class sll5
{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverse()
    {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args)
    {
        sll5 obj = new sll5();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();
        obj.head = obj.reverse();
        obj.display();
    }
}