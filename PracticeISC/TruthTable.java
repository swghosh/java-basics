import java.util.*;

public class TruthTable {
    
    static boolean[][] mapPart(boolean[][] table, boolean[][] part) {
        int l = part[0].length;
        int ctr = 0;
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                if(j == 0) continue;
                if(ctr == (part.length * part[0].length)) ctr = 0;
                table[i][j] = part[ctr / l][ctr % l];
                ctr++;
            }
        }
        return table;
    }
    
    static boolean[][] generateTable(int n) {
        if(n <= 1) {
            boolean[][] table = new boolean[(int)Math.pow(2, n)][n];
            table[0][0] = false;
            table[1][0] = true;
            return table;
        }
        boolean[][] table = new boolean[(int)Math.pow(2, n)][n];
        for(int i = 0; i < table.length / 2; i++) {
            table[i][0] = false;
        }
        for(int i = table.length / 2; i < table.length; i++) {
            table[i][0] = true;
        }
        boolean[][] part = generateTable(n - 1);
        table = mapPart(table, part);
        return table;
    }
    
    static void printTable(boolean[][] table) {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.print(((table[i][j]) ? "1 " : "0 "));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Generate Truth Table of N digits.\nSpecify N -> ");
        int N = sc.nextInt();
        System.out.println("\nGenerated Truth Table");
        printTable(generateTable(N));
    }
    
}