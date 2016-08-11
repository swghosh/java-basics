class Perimeter {
    
    double a, b;
    
    Perimeter(double length, double breadth) {
        a = length;
        b = breadth;
    }
    
    double calculate() {
        double p = 2 * ( a + b );
        return p;
    }
    
    void show() {
        double pr = calculate();
        System.out.println("Length : " + a);
        System.out.println("Breadth : " + b);
        System.out.println("Perimeter : " + pr);
    }
    
}