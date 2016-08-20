class DoubleLinkedList {
    
    DoublyLinkedNode start, end;
    
    /**
     * DoubleLinkedList Constructor
     * Initialises the Double Linked List
     */
    DoubleLinkedList() {
        start = end = null;
    }
    
    /**
     * Method insertFront
     * Inserts an element to the front of the Linked List
     * @param n number to be inserted into list
     */
    void insertFront(int n) {
        //When Linked List is empty
        if(start == null) {
            start = end = new DoublyLinkedNode(n);
        }
        //Otherwise
        else {
            DoublyLinkedNode temp = new DoublyLinkedNode(n);
            start.previous = temp;
            temp.next = start;
            start = temp;
        }
    }
    
    /**
     * Method insertRear
     * Inserts an element to the rear of the Linked List
     * @param n number to be inserted into list
     */
    void insertRear(int n) {
        //When Linked List is empty
        if(end == null) {
            end = start = new DoublyLinkedNode(n);
        }
        //Otherwise
        else {
            DoublyLinkedNode temp = new DoublyLinkedNode(n);
            end.next = temp;
            temp.previous = end;
            end = temp;
        }
    }
    
    /**
     * Method deleteFront
     * Deletes an element from the front of the Linked List
     * @return value of the deleted element
     */
    int deleteFront() {
        //When Linked List is empty
        if(start == null) {
            return -9999;
        }
        //When Linked List has only one element
        else if(start == end) {
            int temp = start.data;
            start = end = null;
            return temp;
        }
        //Otherwise
        else {
            int temp = start.data;
            DoublyLinkedNode ptr = start.next;
            ptr.previous = null;
            start = ptr;
            return temp;
        }
    }
    
    /**
     * Method deleteRear
     * Deletes an element from the rear of the Linked List
     * @return value of the deleted element
     */
    int deleteRear() {
        //When Linked List is empty
        if(end == null) {
            return -9999;
        }
        //When Linked List has only one element
        else if(end == start) {
            int temp = end.data;
            end = start = null;
            return temp;
        }
        //Otherwise
        else {
            int temp = end.data;
            DoublyLinkedNode ptr = end.previous;
            ptr.next = null;
            end = ptr;
            return temp;
        }
    }
    
    /**
     * Method printTraversel
     * Prints all elements in the Linked List upon both forward as well as backward traversal
     */
    void printTraversal() {
        //Traversal forward
        DoublyLinkedNode ptr = start;
        while(ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        //Prints a line to seprate the two traversals
        System.out.println("\n\n");
        //Traversal backward
        ptr = end;
        while(ptr != null) {
            System.out.print(ptr.data + " <-- ");
            ptr = ptr.previous;
        }
    }
}