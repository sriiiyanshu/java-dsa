//find nth node from the end of the linked list
public class sll7
{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode findEnd(int n)
    {
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n)
        {
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null)
        {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
        }

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args)
    {
        sll7 obj = new sll7();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();
        ListNode result = obj.findEnd(2);
        System.out.println("Nth node from the end is: " + result.data);
    }
}