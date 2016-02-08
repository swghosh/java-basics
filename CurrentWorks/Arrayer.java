class Arrayer
{
    int size;int[] ar;
    public Arrayer()
    {
        size=1;
        ar=new int[100];
    }

    public Arrayer(int n)
    {
        size=n;
        ar=new int[100];
    }

    void init(final int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            this.ar[i]=b[i];
        }
        this.size=b.length;
    }

    void insert(int n,int pos)
    {
        pos-=1;
        for(int i=this.size;i>pos;i--)
        {
            this.ar[i]=this.ar[i-1];
        }
        this.ar[pos]=n;
        this.size+=1;
    }

    void delete(int pos)
    {
        pos-=1;
        for(int i=pos;i<this.size-1;i++)
        {
            this.ar[i]=this.ar[i+1];
        }
        this.ar[--this.size]=0;
    }

    void merge(Arrayer k)
    {
        for(int i=0;i<k.size;i++)
        {
            this.ar[this.size+i]=k.ar[i];
        }
        this.size=this.size+k.size;
    }

    Arrayer[] split(int sp)
    {
        Arrayer asc[]=new Arrayer[2];
        asc[0]=new Arrayer(sp);
        asc[1]=new Arrayer(size-sp);
        sp--;
        for(int i=0;i<this.size;i++)
        {
            if(i<sp) asc[0].ar[i]=this.ar[i];
            else asc[1].ar[i-sp]=this.ar[i];
        }
        return asc;
    }

    void display()
    {
        System.out.println();
        for(int i=0;i<size;i++)
            System.out.print(this.ar[i]+"|");
    }
}