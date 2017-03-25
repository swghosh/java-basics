class Dequeue extends Queue {
    
    public Dequeue() {
        super();
    }

    public Dequeue(int capacity) {
        super(capacity);
    }

    void insertRear(int element) {
        super.insert(element);
    }

    int deleteFront() {
        return super.delete();
    }

    void insertFront(int element) {
        if(front == 0) {
            System.err.println("Queue overflow");
            return;
        }

        if(front == -1 && rear == -1) {
            front = rear = 0;
        }
        else {
            front = front - 1;
        }
        q[front] = element;
    }

    int deleteRear() {
        if(front == -1 && rear == -1) {
            System.err.println("Queue underflow");
            return -9999;
        }

        int val = q[rear];
        if(front == rear) {
            front = rear = -1;
        }
        else {
            rear = rear - 1;
        }
        return val;
        
    }
}