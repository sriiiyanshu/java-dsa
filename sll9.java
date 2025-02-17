//insert a node in a sorted linked list
public class sll9
{
    private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node insert(int value)
    {
        Node newNode = new Node(value);
        Node current = head;
        Node temp = null;
        while(current != null && current.data < newNode.data)
        {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
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
        sll9 sll = new sll9();
        sll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        sll.head.next = second;
        second.next = third;

        sll.display();
        sll.insert(25);
        sll.display();
    }
}