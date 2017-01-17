/*
 * Swarup Ghosh
 * Class XII A
 * ISC 2017 Practice for Computer Practical
 * 17.01.2017
*/
import java.util.Scanner;
class Matrix {
    // generates the patterned matrix
    static char[][] generate(char ch1, char ch2, char ch3, int n) {
        char[][] M = new char[n][n];
        // new array initialised
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                if(i <= n - i -1) {
                    if(i == j) M[i][j] = ch3;
                    else if(j == n - i - 1) M[i][j] = ch3;
                    else if(j < i) M[i][j] = ch2;
                    else if(j > n - i - 1) M[i][j] = ch2;
                    else M[i][j] = ch1;
                }
                else {
                    if(i == j) M[i][j] = ch3;
                    else if(j == n - i - 1) M[i][j] = ch3;
                    else if(j < n - i - 1) M[i][j] = ch2;
                    else if(j > i) M[i][j] = ch2;
                    else M[i][j] = ch1;
                }
            }
        }
        return M;
    }
    
    // main method to be executed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        System.out.print("FIRST CHARACTER : ");
        char ch1 = sc.next().charAt(0);
        System.out.print("SECOND CHARACTER : ");
        char ch2 = sc.next().charAt(0);
        System.out.print("THIRD CHARACTER : ");
        char ch3 = sc.next().charAt(0);
        char[][] M = generate(ch1, ch2, ch3, n);
        // print the generate array
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
} // end of class