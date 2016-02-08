public class PronicNumber {
    public static boolean isPronic(int n) {
        boolean flag = false;
        for(int i = 1; i < n; i++) {
            if(n % i == 0 && n / i == i + 1) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            if(isPronic(i)) {
                System.out.println(i);
            }
        }
    }
}