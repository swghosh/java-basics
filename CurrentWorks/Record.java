import java.util.*;

class Record {
    
    String name[];
    int[] mk;
    
    Record() {
        name = new String[10];
        mk = new int[10];
    }
    
    void readValues() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < name.length; i++) {
            System.out.print("Name : ");
            name[i] = sc.next();
            System.out.print("Rank : ");
            mk[i] = sc.nextInt();
        }
    }
    
    void display() {
        System.out.println("NAME\tRANK");
        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "\t" + mk[i]);
        }
    }
    
}