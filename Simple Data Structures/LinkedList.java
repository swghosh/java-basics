class Node {
    
    private int data;
    private Node next;

    Node() {
        this(0);
    }

    Node(int data) {
        next = null;
        this.data = data;
    }

    void setNextLink(Node n) {
        this.next = n;
    }

    Node getNextLink() {
        return this.next;
    }

    void setData(int n) {
        this.data = n;
    }

    int getData() {
        return this.data;
    }
}

public class LinkedList {

    Node start;

    public LinkedList() {
        this(null);
    }

    public LinkedList(Node n) {
        this.start = n;
    }

    boolean isEmpty() {
        return (this.start == null);
    }

    void insertFront(int element) {
        if(this.start == null) {
            this.start = new Node(element);
        }
        else {
            Node n = new Node(element);
            n.setNextLink(this.start);
            this.start = n;
        }
    }

    void insertRear(int element) {
        if(this.start == null) {
            this.start = new Node(element);
        }
        else {
            Node n = new Node(element);
            Node ptr = null;
            for(ptr = this.start; ptr.getNextLink() != null; ptr = ptr.getNextLink());
            ptr.setNextLink(n);
        }
    }

    int deleteFront() {
        if(this.start == null) {
            System.err.println("Underflow");
            return -9999;
        }

        int val = this.start.getData();
        if(this.start.getNextLink() == null) {
            this.start = null;
        }
        else {
            this.start = this.start.getNextLink();
        }
        return val;
    }

    int deleteRear() {
        if(this.start == null) {
            System.err.println("Underflow");
            return -9999;
        }

        int val = 0;
        if(this.start.getNextLink() == null) {
            val = this.start.getData();
            this.start = null;
        }
        else {
            Node ptr = null;
            for(ptr = this.start; ptr.getNextLink().getNextLink() != null; ptr = ptr.getNextLink());
            val = ptr.getNextLink().getData();
            ptr.setNextLink(null);
        }
        return val;
    }

    void printTraversal() {
        for(Node ptr = this.start; ptr != null; ptr = ptr.getNextLink()) {
            System.out.print(ptr.getData() + " -> ");
        }
        System.out.println();
    }

}