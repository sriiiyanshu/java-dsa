
import java.util.NoSuchElementException;

class CSLL{
    private Listnode last;
    private int length;

    private class Listnode{
        private Listnode next;
        private int data;

    public Listnode(int data){
        this.data=data;
    }
    }

    public CSLL(){
        last=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void createCSLL(){
        Listnode first = new Listnode(1);
        Listnode second = new Listnode(5);
        Listnode third = new Listnode(10);
        Listnode fourth = new Listnode(15);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;

        length=4;
    }

    public void disp(){
        if(last==null)
        {
            return;
        }
        Listnode first = last.next;
        while(first!=last)
        {
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.print(first.data+" \n");
    }

    public void insertStart(int data)
    {
        Listnode temp = new Listnode(data);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }

    public void insertLast(int data)
    {
        Listnode temp = new Listnode(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else
        {
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }

    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Listnode temp = last.next;
        if(last.next==last)
        {
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
    }

    public static void main(String[] args) {
        CSLL csll = new CSLL();
        csll.createCSLL();
        csll.insertStart(12);
        csll.insertLast(24);
        csll.removeFirst();
        csll.disp();
    }
}