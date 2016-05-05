import java.util.*;
public class HadamoreMatrix {

    /* generates a hadamore boolean matrix of n x n dimensions */
    public static boolean[][] generateMatrix(int n) {
        boolean matrix[][] = new boolean[n][n];
        if(n == 1) {
            matrix[0][0] = true;
        }
        else {
            int b = (int)(Math.log(n) / Math.log(2));
            int c = (int)Math.pow(2, b - 1);
            boolean[][] portion1 = generateMatrix(c);
            for(int i = 0; i < c; i++) {
                for(int j = 0; j < c; j++) {
                    matrix[i][j] = portion1[i][j];//Adds matrix elements in left top portion
                    matrix[i + c][j] = portion1[i][j];//Adds matrix elements in left bottom portion
                    matrix[i][j + c] = portion1[i][j];//Adds matrix elements in right top portion
                }
            }
            boolean[][] portion2 = invertMatrix(portion1);
            for(int i = c, k = 0; i < n; i++, k++) {
                for(int j = c, l = 0; j < n; j++, l++) {
                    matrix[i][j] = portion2[k][l];//Adds matrix elements in right bottom portion
                }
            }
        }
        return matrix;
    }

    /* generates the inverted boolean matrix */
    public static boolean[][] invertMatrix(boolean[][] matrix) {
        boolean[][] invertedMatrix = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                invertedMatrix[i][j] = !matrix[i][j];//Inverts the boolean variable
            }
        }
        return invertedMatrix;
    }

    /* prints a boolean matrix */
    public static void printMatrix(boolean[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(((matrix[i][j]) ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
    
    /* main method to be executed */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HADAMORE MATRIX GENERATOR");
        System.out.print("value for n -> ");
        int n = sc.nextInt();
        double b = Math.log(n) / Math.log(2);
        if(b != Math.ceil(b)) {
            System.out.println("Invalid Input. n must be 2 raised to the power some whole number");
            return;
        }
        System.out.println();
        printMatrix(generateMatrix(n));
    }
}