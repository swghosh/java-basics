class Circle extends Shape {
    int r;
    Circle(int r) {
        super();
        this.r = r;
    }
    double area() {
        return Math.PI * Math.pow(r, 2);
    }
}