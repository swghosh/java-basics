class Salary extends Employee {

    float basic;

    Salary(int empNo, String empName, String empDesig, float basic) {
        super(empNo, empName, empDesig);
        this.basic = basic;
    }

    void calculate() {
        double salary = this.basic + (0.1 * this.basic) + (0.15 * this.basic); // salary = basic + da + hra
        double netsal = salary - (0.8 * salary); // net salary = salary - pf

        super.display();
        System.out.println("Net Salary: " + netsal);
    }
    
}