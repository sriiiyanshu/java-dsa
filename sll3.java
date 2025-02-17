//deletion of node from the beginning, end and at any position in singly linked list
public class sll3
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

    public void deleteFirst()
    {
        if(head == null)
        {
            return;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteLast()
    {
        if (head == null || head.next == null)
        {
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    public void deleteAtPosition(int position)
    {
        if(position == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
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

    public static void main(String[] args)
    {
        sll3 obj = new sll3();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();
        obj.deleteFirst();
        obj.display();
        obj.deleteLast();
        obj.display();
        obj.deleteAtPosition(2);
        obj.display();
    }
}