class QueueList extends DoubleLinkedList{
    
    /**
     * QueueList Constructor
     * 
     */
    QueueList() {
        super();
    }
    
    /**
     * Method insert
     * 
     * @param n A parameter
     */
    void insert(int n) {
        super.insertRear(n);
    }
    
    /**
     * Method delete
     *
     * @return The return value
     */
    int delete() {
        return super.deleteFront();
    }
    
    /**
     * Method printTraversal
     *
     */
    void printTraversal() {
        DoublyLinkedNode ptr = start;
        while(ptr != null) {
            System.out.print(ptr.data + "|");
            ptr = ptr.next;
        }
    }
}