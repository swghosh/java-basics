public class TruthTable {
    private static void printTruthTable(int n) {
        int rows = (int) Math.pow(2,n);

        for (int i=0; i<rows; i++) {
            for (int j=n-1; j>=0; j--) {
                System.out.print((i/(int) Math.pow(2, j))%2 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTruthTable(3); //enter any natural int
    }
}
