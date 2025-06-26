import java.util.NoSuchElementException;

public class Queue {
    private Listnode front;
    private Listnode rear;
    private int length;

    private class Listnode{
        private int data;
        private Listnode next;

        public Listnode(int data){
            this.data=data;
            next=null;
        }
    }

    public Queue(){
        front = null;
        rear= null;
        length=0;
    }

    int length(){
        return length;
    }

    boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        Listnode temp = new Listnode(data);
        if(isEmpty()){
            front=temp;
        }
        else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }

    public int dequeue(){
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }

    public void disp(){
        Listnode current = front;
        while(current!=null){
            System.out.print(current.data+"<--");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(15);
        q1.disp();
        q1.dequeue();
        q1.dequeue();
        q1.disp();
    }
}
