import java.util.Scanner;
class GuitarTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Electric Guitar Strings' number -> ");
        ElectricGuitar eg = new ElectricGuitar(sc.nextInt());
        System.out.print("Electric Bass Guitar Strings' number -> ");
        ElectricBassGuitar ebg = new ElectricBassGuitar(sc.nextInt());
        System.out.println();
        eg.play();
        ebg.play();
    }
}