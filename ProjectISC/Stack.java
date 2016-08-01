public class Stack
{
    int st[];int top;int capacity;
    public Stack()
    {
        this(100);
    }
    public Stack(int limit)
    {
        capacity=limit;
        st=new int[capacity];
        top=-1;
    }
    public void push(int element)
    {
        if(top+1>=capacity) {
            System.out.println("Stack Overflow");
            return;
        }
        st[++top]=element;
    }
    public int pop()
    {
        if(top<0) {
            System.out.println("Stack Underflow");
            return -9999;
        }
        return st[top--];
    }
    public void display()
    {
        for(int i=top;i>=0;i--) {
            System.out.println("|"+st[i]+"|");
        }
    }
}
    