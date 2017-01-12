import java.util.Scanner;
public class Merger {

    int[][] mat;
    int rSize, cSize;

    Merger(int m, int n) {
        this.rSize = m; // assigns row size
        this.cSize = n; // assigns column size
        this.mat = new int[this.rSize][this.cSize]; // initialises an empty matrix
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < this.rSize; i++) {
            for(int j = 0; j < this.cSize; j++) {
                System.out.print("Matrix element at [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = sc.nextInt(); // element entry from systemin
            }
        }
    }

    void display() {
        for(int i = 0; i < this.rSize; i++) {
            for(int j = 0; j < this.cSize; j++) {
                System.out.print(mat[i][j] + " "); // prints elements in matrix to systemout
            }
            System.out.println();
        }
    }

    Merger merge(Merger M) {
        Merger a = new Merger(this.rSize, this.cSize + M.cSize);
        // assuming this, M mergers have same row size
        for(int i = 0; i < this.rSize; i++) {
            int c = 0;
            for(int j = 0; j < this.cSize; j++) {
                a.mat[i][c++] = this.mat[i][j];
            }
            for(int j = 0; j < M.cSize; j++) {
                a.mat[i][c++] = M.mat[i][j];
            }
        }
        return a;
    }

    void sort() {
        for(int i = 0; i < this.rSize; i++) {
            for(int j = 0; j < this.cSize - 1; j++) {
                // bubble sorting the current row
                for(int k = 0; k < this.cSize - j - 1; k++) {
                    if(mat[i][k] > mat[i][k + 1]) {
                        // swapping elements
                        int temp = mat[i][k];
                        mat[i][k] = mat[i][k + 1];
                        mat[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}