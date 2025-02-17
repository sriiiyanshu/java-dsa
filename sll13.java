//merge two sorted linked lists into one sorted linked list
class sll13
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

    public ListNode merge (ListNode a,ListNode b)
    {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        while (a != null && b != null)
        {
        if(a.data <= b.data)
        {
            tail.next = a;
            a = a.next;
        }
        else
        {
            tail.next = b;
            b = b.next;
        }
        tail = tail.next;
        }
        if(a == null)
        {
            tail.next = b;
        }
        else
        {
            tail.next = a;
        }
        return temp.next;
    }

    public void display(ListNode head)
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
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
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args)
    {
        sll13 sl1 = new sll13();
        sl1.insertAtEnd(1);
        sl1.insertAtEnd(4);
        sl1.insertAtEnd(8);

        sll13 sl2 = new sll13();
        sl2.insertAtEnd(3);
        sl2.insertAtEnd(6);
        sl2.insertAtEnd(7);

        sl1.display(sl1.head);
        sl2.display(sl2.head);

        ListNode head = sl1.merge(sl1.head,sl2.head);
        sl1.display(head);

    }
}
