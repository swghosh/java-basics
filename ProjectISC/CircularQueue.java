public class CircularQueue {

    int q[], size, rear, front;

    /**
     * CircularQueue Constructor
     * Initialises a circular queue of size 100
     */
    CircularQueue() {
        this(100);
    }

    /**
     * CircularQueue Constructor
     * Initialises a circular queue of size passed as argument
     * @param size sets the circular queue size
     */
    CircularQueue(int size) {
        this.size = size;
        q = new int[size];
        rear = front = -1;
    }

    /**
     * Method insert
     * Inserts an element to the rear end of the queue
     * Prints appropriate message when queue overflows
     * @param element the element to be inserted
     */
    void insert(int element) {
        if((front == rear + 1) || (front == 0 && rear == size)) System.err.println("Circular Queue Overflow");
        if(front == -1 && rear == -1) {
            front = 0;
            q[++rear] = element;
        }
        else {
            q[++rear] = element;
        }
    }

    /**
     * Method delete
     * Deletes the element present at the front end of the queue
     * Prints appropriate message when queue underflows
     * @return the element that is deleted
     */
    int delete() {
        if(front == -1 && rear == -1) {
            System.err.println("Circular Queue Underflow");
            return -9999;
        }
        int temp = q[front];
        if(front == rear) front = rear = -1;
        else front = front + 1;
        return temp;
    }

    /**
     * Method display
     * Displays all elements present in the queue in sequential fashion from front to rear
     */
    void display() {
        for(int i = front; i <= rear; i++) {
            System.out.print(q[i] + " | ");
        }
    }

}