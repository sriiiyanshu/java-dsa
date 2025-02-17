//insertion of nodes
public class sll2
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

    public void insertAtBeginning(int value)
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head == null)
        {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int value, int position)
    {
        ListNode newNode = new ListNode(value);
        if(position == 1)
        {
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
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
        sll2 obj = new sll2();
        /*obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        //obj.insertAtBeginning(5);
       //obj.insertAtEnd(4);
       */ 
       obj.insertAtPosition(3,1);
       obj.insertAtPosition(2,2);
       obj.insertAtPosition(1,1);
       obj.insertAtPosition(4,3);
       obj.display();
    }
}