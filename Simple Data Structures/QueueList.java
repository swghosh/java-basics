class QueueList extends LinkedList {

    public QueueList() {
        super();
    }

    public QueueList(Node n) {
        super(n);
    }

    boolean isEmpty() {
        return super.isEmpty();
    }

    void insert(int element) {
        super.insertRear(element);
    }

    int delete() {
        return super.deleteFront();
    }

    void printTraversal() {
        super.printTraversal();
    }

}