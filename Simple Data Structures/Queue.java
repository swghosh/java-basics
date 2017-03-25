public class Queue {

    int q[], front, rear;

    public Queue() {
        this(50);
    }
    public Queue(int capacity) {
        q = new int[capacity];
        front = rear = -1;
    }

    boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    void insert(int element) {
        if(rear + 1 >= q.length) {
            System.err.println("Queue overflow");
            return;
        }

        if(front == -1 && rear == -1) {
            front = rear = 0;
        }
        else {
            rear = rear + 1;
        }
        q[rear] = element;
    }

    int delete() {
        if(front == -1 && rear == -1) {
            System.err.println("Queue underflow");
            return -9999;
        }

        int val = q[front];
        if(front == rear) {
            front = rear = -1;
        }
        else {
            front = front + 1;
        }
        return val;
    }

    void traversal() {
        for(int i = front; i <= rear; i++) {
            System.out.print(q[i]);
        }
        System.out.println();
    }
}