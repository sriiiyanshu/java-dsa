//detect a loop in singly linked list and find start of loop
public class sll11
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

    public boolean detectLoop()
    {
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null && fastPtr.next !=null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)
            {
                return true;
            }
        }
        return false;
    }

    public Node startLoop()
    {
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null &&  fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)
            {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    public Node getStartingNode(Node slowPtr)
    {
        Node temp = head;
        while(slowPtr != temp)
        {
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args)
    {
        sll11 sll = new sll11();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        sll.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        if(sll.detectLoop())
        {
            System.out.println("Loop found");
            System.out.println("Loop starting node is: " + sll.startLoop().data);
        }
        else
        {
            System.out.println("Loop not found");
        }
    }
}