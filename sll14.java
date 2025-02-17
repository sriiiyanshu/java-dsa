public class sll14
{
    private Node head;

    private static class Node
    {
        private int  data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

        public Node add(Node a, Node b)
        {
            Node temp = new Node(0);
            Node tail = temp;
            int carry = 0;
            while(a != null && b != null)
            {
                int x = (a != null) ? a.data : 0;
                int y = (b != null) ? b.data : 0;
                int sum = carry + x + y;
                carry=sum/10;
                tail.next = new Node(sum%10);
                tail = tail.next;
                if(a != null) a = a.next;
                if(b != null) b = b.next;
            }
            if (carry > 0)
            {
                tail.next = new Node(carry);
            }
            return temp.next;
        }

        public void display(Node head)
        {
            Node current = head;
            while(current != null)
            {
                System.out.print(current.data + "-->");
                current = current.next;
            }
            System.out.println("null");
        }

        public void insertAtEnd(int value)
        {
            Node newNode = new Node(value);
            if(head == null)
            {
                head = newNode;
                return;
            }
            Node current = head;
            while(null != current.next)
            {
                current = current.next;
            }
            current.next = newNode;
        }

        public static void main(String[] args)
        {
            sll14 n1 = new sll14();
            n1.insertAtEnd(3);
            n1.insertAtEnd(4);
            n1.insertAtEnd(3);

            sll14 n2 = new sll14();
            n2.insertAtEnd(5);
            n2.insertAtEnd(6);
            n2.insertAtEnd(4);

            n1.display(n1.head);
            n1.display(n2.head);

            sll14 sum = new sll14();
            Node result = sum.add(n1.head, n2.head);
            sum.display(result);

        }
    }