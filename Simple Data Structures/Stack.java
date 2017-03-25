import java.util.*;
public class Stack {
    
    int st[], top;

    public Stack() {
        this(50);
    }
    public Stack(int capacity) {
        st = new int[capacity];
        top = -1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int element) {
        if(top + 1 >= st.length) {
            System.err.println("Stack Overflow");
            return;
        }
        st[++top] = element;
    }

    int pop() { 
        if(top < 0) {
            System.err.println("Stack Underflow");
            return -9999;
        }
        return st[top--];
    }

    void traverse() {
        for(int i = 0; i <= top; i++) {
            System.out.print(st[i] + "|");
        }
        System.out.println();
    }
}