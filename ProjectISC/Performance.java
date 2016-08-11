import java.io.*;
import java.util.*;

/* NOTE: EOL (End of Line) as per Windows System i.e. "\r\n"(Carriage Return followed by New Line) */

public class Performance {

    public static void main(String[] args) throws IOException {
        /* User Input and Menu Display */
        Scanner sc = new Scanner(System.in);
        File f = new File(System.getenv("userprofile")+"/Desktop/Performance.txt");
        System.out.println("---MENU---\n1-Add Record\n2-Display Records");
        System.out.print("Choice-> ");
        int ch=sc.nextInt();
        switch(ch) {
            case 1:
            /* Add Record */
            {
                System.out.print("Name ->");
                String name = sc.next();
                System.out.print("Marks of Subject1 ->");
                int s1 = sc.nextInt();
                System.out.print("Marks of Subject2 ->");
                int s2 = sc.nextInt();
                System.out.print("Marks of Subject3 ->");
                int s3 = sc.nextInt();
                int total = s1 + s2 + s3;
                double percent = (double)(total) / 3;
                /* Write Info to File */
                FileWriter fw = new FileWriter(f,true);
                String write = name + "\t" + Integer.toString(s1) + "\t" + Integer.toString(s2) + "\t" + Integer.toString(s3) + "\t" + Integer.toString(total) + "\t" + Double.toString(percent);
                fw.write(write+"\r\n");
                fw.close();
            }
            break;
            case 2:
            /* Read all Existing Records */
            {
                FileReader fr = new FileReader(f);
                Scanner fline = new Scanner(fr);
                System.out.println("NAME\tSUB1\tSUB2\tSUB3\tNET\t%\tGRADE");
                while(fline.hasNextLine()) {
                    String line = fline.nextLine();
                    Scanner dfeed = new Scanner(line);
                    String name = dfeed.next();
                    int s1 = dfeed.nextInt();
                    int s2 = dfeed.nextInt();
                    int s3 = dfeed.nextInt();
                    int total = dfeed.nextInt();
                    double percent = dfeed.nextDouble();
                    char grade = '\0';
                    /* Assigning grade */
                    if (percent >= 80) grade = 'A';
                    else if(percent < 80 && percent > 60) grade = 'B';
                    else grade = 'C';
                    System.out.println(name + "\t" + Integer.toString(s1) + "\t" + Integer.toString(s2) + "\t" + Integer.toString(s3) + "\t" + Integer.toString(total) + "\t" + Double.toString(percent) + "\t" + grade);
                }
            }
            break;
        }
        sc.close();
    }
}

       