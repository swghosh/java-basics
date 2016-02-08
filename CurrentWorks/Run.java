import java.io.*;
import java.util.*;
public class Run {
    public static void main(String args[]){
    String[] command = new String[3];
    command[0] = "cmd";
    command[1] = "/C";
    command[2] = "md fool";
    try {  
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        //Scanner stdInput=new Scanner(p.getInputStream());
        //Error handling
        //Scanner stdError=new Scanner(p.getErrorStream());
        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String s="";
        while ((s = stdError.readLine()) != null) {
        System.out.println(s);
        }
    }
    //Exception handling
    catch(Exception e) {  
        System.out.println(e.toString());  
        e.printStackTrace();
    }  
}
}