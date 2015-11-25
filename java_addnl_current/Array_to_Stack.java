//SwG Ghosh
import java.util.*;
class Array_to_Stack
{
    int m[];
    Stack st;
    int cap;
    int top;
    Array_to_Stack(int n)
    {
        cap=n;top=-1;
        st=new Stack();
    }

    void input_marks()
    {
        m=new int[cap];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m.length;i++)
        {
            System.out.print("XD Marks "+(i+1)+" ->");
            m[i]=sc.nextInt();
        }
        //sorting
        for(int i =0;i<m.length-1;i++)
        {
            if (m[i]>m[i+1])
            {
                int temp = m[i];
                m[i] = m[i+1];
                m[i+1] = temp;

            }
        }
        for(int i=0;i<m.length;i++)
        {
            pushmarks(m[i]);
        }
    }

    int popmarks()
    {
        return st.pop();
    }

    void pushmarks(int n)
    {
        st.push(n);
    }

    void display()
    {
        st.display();
    }
}