//implement double linked list
public class dll1
{
    private Node head;
    private Node tail;
    private int length;

    public class Node
    {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public dll1()
    {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public int length()
    {
        return length;
    }
    
    public void displayForward()
    {
        if(head == null)
        {
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward()
    {
        if(tail == null)
        {
            return;
        }

        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data + "--> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertLast(int value)
    {
        Node newNode = new Node(value);
        if(isEmpty())
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public static void main(String[] args)
    {
        dll1 dll = new dll1();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(20);
        dll.displayForward();
        dll.displayBackward();
        System.out.println("Length of the doubly linked list: " + dll.length());
    }
}