public class Student
{
    String name;int marks[];String subjects[];double avg;int s[];int sum;
    public Student(String str)
    {
        name=str;
        sum=0;
    }

    public void inputSubjectChoice(String[] str)
    {
        subjects=str;
    }

    public void inputMarks(int n[])
    {
        marks=n;
    }

    public void calculateSum()
    {
        int engc=0;
        for(int i=0;i<subjects.length;i++)
        {
            if(subjects[i].equalsIgnoreCase("english"))
            {
                sum=sum+marks[i];engc=i;
            }
        }
        s=new int[(subjects.length-1)];int k=0;
        for(int i=0;i<subjects.length;i++)
        {
            if(i!=engc)
            {
                s[k++]=marks[i];
            }
        }
        int pos=0;int temp=0;int min=0;
        for(int i=0;i<s.length;i++)//Sorts the array
        {
            min=s[i];
            pos=i;
            for(int j=i+1;j<s.length;j++)
            {
                if(min<s[j])
                {
                    min=s[j];
                    pos=j;
                }
            }
            temp=s[i];
            s[i]=s[pos];
            s[pos]=temp;
        }
        for(int i=0;i<4;i++)
        {
            sum=sum+s[i];
        }
        avg=((double)sum/500)*100;
    }

    public double percentage()
    {
        return avg;
    }
}
