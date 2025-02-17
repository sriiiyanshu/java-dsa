//remove loop from signly linked list
public class sll12
{
    private Node head;

    private static class Node
    {
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void remove()
    {
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null && fastPtr.next !=null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)
            {
                removeLoop(slowPtr);
                return;
            }
        }
    }


    public void removeLoop(Node slowPtr)
    {
        Node temp = head;
        while(slowPtr.next != temp.next)
        {
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        slowPtr.next = null;
    }

    public void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        sll12 sll = new sll12();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        sll.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        sll.remove();
        sll.display();
        
    }
}