/*
 * Swarup Ghosh
 * Class XII-A
 * Selection Examinations
 * Computer Science Practical
 * Calculation of the determinant value from a square matrix
 */
import java.util.*;
class Determinant { int[][] matrix; int length;
    //constructor to initialise a determinant
    Determinant(int[][] matrix, int length) {
        this.matrix = matrix; //Assumes square matrix is taken
        this.length = length; //Assigns matrix, length its passed values
    }
    //returns the value of the determinant of the matrix in current object
    int getValue() {
        return getValue(this.matrix);
    }
    //returns a part of the matrix excluding a row, column
    static int[][] getRemaining(int[][] ar, int indexRow, int indexCol) {
        int l = ar.length - 1;
        int[][] ar2 = new int[l][l];
        int ctr = 0;
        for(int i = 0; i < ar.length; i++) {
            for(int j = 0; j < ar[i].length; j++) { //Ignores, excludes given row, column
                if(i == indexRow || j == indexCol) continue;
                ar2[ctr / l][ctr % l] = ar[i][j];
                ctr++; //counter incremented on every iteration
            }
        }
        return ar2;
    }
    //returns a matrix determinant value from the passed argument
    static int getValue(int[][] ar) {
        //base case, array's only element value returned if length 1
        if(ar.length <= 1)
            return ar[0][0];
        //calculation of determinant value
        int value = 0;
        boolean minus = false; //constantly switches minus on iteration
        for(int i = 0; i < ar[0].length; i++) {
            if(minus) {
                value = value - (ar[0][i] * getValue(getRemaining(ar, 0, i)));
            }
            else {
                value = value + (ar[0][i] * getValue(getRemaining(ar, 0, i)));
            }
            //recursing the getValue above
            minus = !minus; // minus changed
        }
        return value;
    }
    //main method to be executed at runtime
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size : ");
            int size = sc.nextInt();
            //Invalid input condition
            if(size <= 0 || size > 4) {
                System.out.println("Invalid matrix!!");
                return;
            }
            int matrix[][] = new int[size][size]; //new matrix of size length initialised
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.print("Matrix element at [" + (i+1) + "][" + (j+1) + "] : ");
                    matrix[i][j] = sc.nextInt();
                }
            }
            Determinant d = new Determinant(matrix, size);
            int value = d.getValue(); //calculates determinant value
            //print the value of the determinant
            System.out.println("Determinant: " + value);
        } //catch Scanner mismatch input
        catch(InputMismatchException ime) {
            System.out.println("Error in input by user. Number integer was expected.");
            System.out.println(ime.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error occured.\n" + e.getMessage());
        }
    } //end of method main
} //end of class