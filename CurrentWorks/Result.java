import java.util.*;
public class Result
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("\nName->");sc.useDelimiter("\n");
            Student s=new Student(sc.next());
            System.out.print("\nSubjects Count->");
            int n=sc.nextInt();String str[]=new String[n];int mar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("\nSubject Name->");str[i]=sc.next();
                System.out.print(str[i]+" Marks->");mar[i]=sc.nextInt();
            }
            s.inputSubjectChoice(str);s.inputMarks(mar);
            s.calculateSum();
            System.out.println("\n"+s.name+"'s Best of 5="+s.percentage());
        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong :-(");
        }
    }
}