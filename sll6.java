//search an element in singly linked list
public class sll6
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

    public ListNode findMiddle()
    {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
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
        sll6 obj = new sll6();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();
        ListNode middle = obj.findMiddle();
        System.out.println("Middle element is: " + middle.data);

        ListNode fifth = new ListNode(5);
        fourth.next = fifth;

        obj.display();
        middle = obj.findMiddle();
        System.out.println("Middle element is: " + middle.data);
    }
}