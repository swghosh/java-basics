class Wages extends Worker {

    int hrs;
    double rate, wage;

    Wages(String name, double basic, int hrs, double rate) {
        super(name, basic);
        this.hrs = hrs;
        this.rate = rate;
    }

    double overtime() {
        return hrs * rate;
    }

    void display() {
        wage = basic + this.overtime(); // wage calculation
        super.display();
        System.out.println("Overtime hours: " + this.hrs);
        System.out.println("Overtime rate: " + this.rate);
        System.out.println("Overtime amount: " + this.overtime());
        System.out.println("Wage: " + this.wage);
    }

}