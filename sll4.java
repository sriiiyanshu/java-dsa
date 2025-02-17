//search an element in singly linked list
public class sll4
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

    public boolean find(int value)
    {
        ListNode current = head;
        while(current != null)
        {
            if(current.data == value)
            {
                return true;
            }
            current = current.next;
        }
        return false;
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
        sll4 obj = new sll4();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();
        if(obj.find(15))
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}