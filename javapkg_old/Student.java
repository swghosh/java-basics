import java.io.*;
import java.util.*;
public class Student
{
    int[] roll,percent;
    String[] name;
    int size;
    Student(int n)
    {
        size=n; 
        roll=new int[size];percent=new int[size];name=new String[size];
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.print("\n---STUDENT "+(i+1)+" ---\n");
            System.out.print("\tName : ");
            name[i]=sc.next();
            System.out.print("\tRoll no. : ");
            roll[i]=sc.nextInt();
            System.out.print("\tPercentage (%) : ");
            percent[i]=sc.nextInt();
        }
    }
    void rollSort()
    {
        int min=0;String name_temp="";int roll_temp=0,perc_temp=0;int i=0,j=0,pos=0;
        for(i=0;i<size;i++)//Sorts the array
        {
            min=roll[i];
            pos=i;
            for(j=i+1;j<size;j++)
            {
                if(min>roll[j])
                {
                    min=roll[j];
                    pos=j;
                }
            }
            roll_temp=roll[pos];
            roll[pos]=roll[i];
            roll[i]=roll_temp;
            //
            name_temp=name[pos];
            name[pos]=name[i];
            name[i]=name_temp;
            //
            perc_temp=percent[pos];
            percent[pos]=percent[i];
            percent[i]=perc_temp;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("---STUDENTS DB---");
        System.out.print("Enter no. of students : ");
        Student s=new Student(new Scanner(System.in).nextInt());
        System.out.println();
        s.read();s.rollSort();
        System.out.println();
        System.out.println("NAME\t\tROLL NO.\tPERCENTAGE(%)");
        for(int i=0;i<s.size;i++)
        {
            System.out.println(s.name[i]+"\t\t"+s.roll[i]+"\t\t"+s.percent[i]);
        }
    }
}
