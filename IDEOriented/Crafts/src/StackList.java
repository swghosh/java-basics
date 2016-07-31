
public class StackList {
	Node start, top;
	
	StackList() {
		start = top = null;
	}
	
	void push(Node n) {
		if(top == null) start = top = n;
		else top.next = n;
		for(Node temp = top; temp != null; temp = temp.next) top = temp;
	}
	
	Node pop() {
		if(top == null) return null;
		else if(start == top) {
			Node temp = top;
			start = top = null;
			return temp;
		}
		else {
			Node ptr = start;
			Node temp = null;
			while(ptr.next.next != null) ptr = ptr.next;
			top = ptr;
			temp = ptr.next;
			ptr.next = null;
			return temp;
		}
	}
	
	public String toString() {
		String str = "Stack: ";
		for(Node temp = top; temp != null; temp = temp.next) str = str + temp.getData() + "|";
		return str;
	}
}
