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

class Area extends Perimeter {
    
    double h, area;
    
    Area(double length, double breadth, double height) {
        super(length, breadth);
        h = height;
    }
    
    void doArea() {
        area = b * h;
    }
    
    void show() {
        System.out.println("Length : " + a);
        System.out.println("Breadth : " + b);
        System.out.println("Height : " + h);
        System.out.println("Height : " + h);
        double pr = calculate();
        System.out.println("Perimeter : " + pr);
        System.out.println("Area : " + area);
    }
    
}