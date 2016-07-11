public class SeriesSum {
    int x;
    int pow(int base, int power) {
        if(power == 1)
            return base;
        else
            return base * pow(base, power - 1);
    }
    double series(int i) {
        double a = (double)pow(x, pow(2, i)) / (double)pow(i, i);
        if(i == 1)
            return a;
        else
            return a + series(i - 1);
    }
    void getX(int x) {
        this.x = x;
    }
}