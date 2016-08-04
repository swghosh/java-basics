import java.util.*;
class MatrixSpecialInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        int[][] dda = new int[N][N];
        
        int m = -1, n = -1;
        
        //takes user input of elements if matrix in tabular form
        for(int i = 0; i < dda.length; i++) {
            
            for(int j = 0; j < dda[i].length; j++) { 
                
                System.out.println("\f\nFill the matrix!");
                
                for(int k = 0; k <= m - 1 ; k++) { 
                    
                    for(int l =0; l < dda[k].length; l++) { 
                        
                        System.out.print(dda[k][l] + "\t"); 
                    } 
                    
                    System.out.println(); 
                } 
                for(int f = 0; f <= n; f++) { 
                    
                    System.out.print(dda[m][f] + "\t");
                    
                    if(f - 1 == dda[i].length) System.out.println(); 
                }
                
                m = i;
                n = j;
                dda[m][n] = sc.nextInt();
            }
        }
        
        //prints the matrix in tabular form
        System.out.println("\f\n\nThe Matrix which you entered is ");
        for(int i = 0; i < dda.length; i++) {
            
            for(int j = 0; j < dda[i].length; j++) { 
                System.out.print(dda[i][j] + "\t");
            }
            
            System.out.println();
        }
    }
}