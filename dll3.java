import java.util.NoSuchElementException;

public class dll3 {
    public class ListNode{
        int data;
        ListNode prev;
        ListNode next;

        public ListNode(int data)
        {
            this.data=data;
        }
     }

     private ListNode head;
     private ListNode tail;
     private int length;

     public dll3()
     {
        this.head=null;
        this.tail=null;
        this.length=0;
     }

     public void disp()
     {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
     }

     public void insertLast(int value){
        ListNode newNode= new ListNode(value);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
     }

     public void deleteFirst(){
        if(length==0)
        {
            throw new NoSuchElementException();
        }
        ListNode temp=head;
        if(head==tail)
        {
            tail=null;
        }
        else{
            head.next.prev=null;
        }
        head=head.next;
        temp.next=null;
        length--;
     }

     public void deleteEnd()
     {
        if(length==0)
        {
            throw new NoSuchElementException();
        }
        ListNode temp=tail;
        if(head==tail)
        {
            head=null;
        }
        else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
     }

     public static void main(String[] args) {
        dll3 list=new dll3();
        for(int i=0;i<5;i++)
        {
            list.insertLast(i);
        }
        list.disp();
        list.deleteFirst();
        list.disp();
        list.deleteEnd();
        list.disp();
     }
}
