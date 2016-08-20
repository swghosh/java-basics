class CircularQueueList {
    
    Node start;
    
    /**
     * CircularQueueList Constructor
     * Initialises the circular queue
     */
    CircularQueueList() {
        start = null;
    }
    
    /**
     * Method insert
     * Inserts an element to the rear of the queue
     * @param n element to be inserted
     */
    void insert(int n) {
        //If the queue is empty
        if(start == null) {
            start = new Node(n);
            start.next = start;
        }
        //Otherwise
        else {
            Node ptr = start;
            while(ptr.next != start) ptr = ptr.next;
            Node temp = new Node(n);
            temp.next = start;
            ptr.next = temp;
        }
    }
    
    /**
     * Method delete
     * Deletes an element from the front of the queue
     * @return the deleted element
     */
    int delete() {
        //If the queue is empty
        if(start == null) {
            return -9999;
        }
        //If there is only element present
        else if(start.next == start) {
            int temp = start.getInt();
            start = null;
            return temp;
        }
        //Otherwise
        else {
            int temp = start.getInt();
            Node ptr = start;
            while(ptr.next != start) ptr = ptr.next;
            start = start.next;
            ptr.next = start;
            return temp;
        }
    }
    
    /**
     * Method printTraversal
     * Prints the elements in the queue traversing from beginning to end
     */
    void printTraversal() {
        //If the queue is empty
        if(start == null) return;
        //Otherwise
        Node ptr = start;
        do {
            System.out.print(ptr.getInt() + "->");
            ptr = ptr.next;
        }
        while(ptr != start);
    }
}