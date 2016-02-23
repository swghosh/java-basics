public class Pattern434 {
    public static void main(String[] args) {
        boolean high = false;
        for(int i = 2, j = 1; i >= 0; i--, j+=2) {
            for(int c = 1; c <= i; c++) {
                System.out.print("  ");
            }
            high = false;
            for(int k = 1; k <= j; k++) {
                high = !high;
                System.out.print((high ? 4 : 3) + " ");
            }
            System.out.print("\n");
        }
        for(int i = 1, j = 3; i <= 2; i++, j-=2) {
            for(int c = 1; c <= i; c++) {
                System.out.print("  ");
            }
            high = false;
            for(int k = 1; k <= j; k++) {
                high = !high;
                System.out.print((high ? 4 : 3) + " ");
            }
            System.out.print("\n");
        }
    }
}