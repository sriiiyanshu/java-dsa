//remove duplicates from sorted linked list
public class sll8
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
    
    public void removeDuplicate()
    {
        ListNode current = head;
        while(current != null && current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
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

    public void addBeginning(int value)
    {
        if(head == null)
        {
            head = new ListNode(value);
        }
        else
        {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }   
    }

    public static void main(String[] args)
    {
        sll8 obj = new sll8();
        obj.addBeginning(3);
        obj.addBeginning(3);
        obj.addBeginning(3);
        obj.addBeginning(2);
        obj.addBeginning(2);
        obj.addBeginning(1);

        obj.display();
        obj.removeDuplicate();
        obj.display();
    }
}