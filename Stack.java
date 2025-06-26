public class Stack {

    private Listnode top;
    private int length;

    private class Listnode{
        private Listnode next;
        private int data;

        public Listnode(int data)
        {
            this.data=data;
        }
    }

    public Stack(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public void push(int data){
        Listnode temp = new Listnode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    
    public int pop(){
        int result = top.data;
        top=top.next;
        length--;
        return result;
    }

    public void disp(){
        if(length==0)
        {
            return;
        }Listnode temp=top;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+"\n");
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(24);
        st.disp();
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.disp();
    }
}
