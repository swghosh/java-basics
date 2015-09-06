public class Data<Dx>
{
    Object data[];
    Data()
    {
        this(10);
    }

    Data(int l)
    {
        data=new Object[l];
    }

    void insert(int pos,Dx item)
    {
        data[pos]=item;
    }

    boolean search(Dx item)
    {
        boolean flag=false;
        for(int i=0;i<data.length;i++)
        {
            if(data[i]==item || data[i].equals(item))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
}
