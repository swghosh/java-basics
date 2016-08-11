class Rectangle extends Shape {
    int l, b;
    Rectangle(int l, int b) {
        super();
        this.l = l;
        this.b = b;
    }
    double area() {
        return l * b;
    }
}