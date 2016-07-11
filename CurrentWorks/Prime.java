class Prime {
    
    static boolean primeTraverse(int n, int i) {
        if(i == 1) return true;
        else if(n % i == 0) return false;
        else return primeTraverse(n, i - 1);
    }
    
    static boolean isPrime(int n) {
        return primeTraverse(n, n - 1);
    }
    
}