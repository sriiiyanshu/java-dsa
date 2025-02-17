//delete a given key from singly linked list
public class sll10
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

    public void delete(int key)
    {
        Node current = head;
        Node temp = null;
        while(current != null && current.data != key)
        {
            temp = current;
            current = current.next;
        }
        if(current == null)
        {
            return;
        }
        temp.next = current.next;   
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
        sll10 sll = new sll10();
        sll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        sll.head.next = second;
        second.next = third;

        sll.display();
        sll.delete(20);
        sll.display();
    }
}