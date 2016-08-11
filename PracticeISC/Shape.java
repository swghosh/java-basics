import java.util.*;
abstract class Shape {
    int shapeid;
    void read() {
        System.out.print("\n Shape id ->");
        shapeid = new Scanner(System.in).nextInt();
    }
    void show() {
        System.out.println("Shape id = " + shapeid);
        System.out.println("Area = " + area());
    }
    abstract double area();
}