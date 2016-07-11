class Fibonacci {
    static int fibonacci(int n) {
        if(n == 0 || n == 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static String generateSeries(int n) {
        String s = "";
        for(int i = 0; i <= n; i++) s = s + fibonacci(i) + " ";
        return s;
    }
}