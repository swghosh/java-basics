//MVC Design Pattern, =>Viewer
//Title:CheckBoard
import java.io.*;
import java.util.*;
class CheckBoardView
{
    public static void main(String[] args)
    {
        CheckBoard c=new CheckBoard();
        PrintWriter out=new PrintWriter(System.out,true);
        c.print(out);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            out.print("\f");
            c.print(out);
            int score[]=c.score();
            out.println("USER 1 SCORE: "+score[0]);
            out.println("USER 2 SCORE: "+score[1]);
            out.println("Next Move");
            System.out.print("MOVE ID [DIMENSION ROW]->");
            int m=sc.nextInt()-1;
            System.out.print("MOVE ID [DIMENSION COLUMN]->");
            int n=sc.nextInt()-1;
            c.move(m,n);
        }
    }
}