
public class Node {
    protected int data;
    Node next;
    public Node(int element) {
        data = element;
        next = null;
    }

    int getData() {
        return data;
    }
    
    public Node() {
    	this(0);
    }
    
    void setData(int n) {
    	data = n;
    }
}
