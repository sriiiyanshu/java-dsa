//insert elemts at beginning and end



public class dll2 {
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

     public dll2()
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
        System.out.print("null");
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

     public void insertBegin(int value)
     {
        ListNode newNode=new ListNode(value);
        if(tail==null)
        {
            tail=newNode;
        }
        else
        {
            head.prev=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
     }

     public static void main(String[] args) {
        dll2 li=new dll2();
        for(int i=0;i<5;i++){
            li.insertBegin(i);
        }

        li.disp();
     }
}
