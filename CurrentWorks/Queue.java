public class Queue
{
    int q[];
    int front,rear;
    Queue()
    {
        q=new int[50];
        front=-1;
        rear=-1;
    }
    void insert(int element)
    {
        if(rear==49) {
            System.out.println("Queue Overflow");
            return;
        }
        if(rear==-1 && front==-1) {
            front=0;
            rear=0;
        }
        else rear=rear+1;
        q[rear]=element;
    }
    int delete()
    {
        if(front==-1) {
            System.out.print("Queue Underflow");
            return -9999;
        }
        int val=q[front];
        if(front==rear) {
            front=rear=-1;
        }
        else front=front+1;
        return val;
    }
    void display()
    {
        if(front==-1) return;
        System.out.print("|");
        for(int i=front;i<=rear;i++) {
            System.out.print(q[i]+"|");
        }
    }
}