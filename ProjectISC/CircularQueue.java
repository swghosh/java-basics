public class CircularQueue {

    int q[], size, rear, front;
    CircularQueue() 
    {
        this(100);
    }

    CircularQueue(int size) 
    {
        this.size = size;
        q = new int[size];
        rear = front = -1;
    }

    void insert(int element) 
    {
        if((front == rear + 1) || (front == 0 && rear == (size-1))) {
            System.err.println("Circular Queue Overflow");
            return;
        }
        else
        {
            if(front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            }
            else if(rear == (size - 1)) {
                rear = 0;
            }
            else 
                rear = rear + 1;
        }
        q[rear] = element;
    }

    int delete() 
    {
        if(front == -1 && rear == -1) {
            System.err.println("Circular Queue Underflow");
            return -9999;
        }
        int temp = q[front];
        if(front == rear) {
            front = rear = -1;
        }
        else if(front == (size-1)) {
            front = 0;
        }
        else {
            front = front + 1;
        }
        return temp;
    }

    void display() 
    {
        System.out.println("CQ:");
        if(front <= rear) {
            for(int i = front; i <= rear; i++) {
                System.out.print(q[i] + " | ");
            }
        }
        else {
            for(int i = front; i < size; i++) {
                System.out.print(q[i] + " | ");
            }
            for(int i = 0; i <= rear; i++) {
                System.out.print(q[i] + " | ");
            }
        }
    }

}