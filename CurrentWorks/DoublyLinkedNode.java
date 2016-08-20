class DoublyLinkedNode {
    
    DoublyLinkedNode previous, next;
    int data;
    
    /**
     * DoublyLinkedNode Constructor
     * Initialises the node storing 0 as its default data value
     */
    DoublyLinkedNode() {
        this(0);
    }
    
    /**
     * DoublyLinkedNode Constructor
     * Initialises the node
     * @param n the data value to be assigned to the DoublyLinkedNode
     */
    DoublyLinkedNode(int n) {
        previous = next = null;
        data = n;
    }
    
}