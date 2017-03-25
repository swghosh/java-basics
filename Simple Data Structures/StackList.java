class StackList extends LinkedList {

    public StackList() {
        super();
    }

    public StackList(Node n) {
        super(n);
    }

    boolean isEmpty() {
        return super.isEmpty();
    }

    void push(int element) {
        super.insertRear(element);
    }

    int pop() {
        return super.deleteRear();
    }

    void printTraversal() {
        super.printTraversal();
    }

}