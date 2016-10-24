class Employee {
    
    int empNo;
    String empName, empDesig;
    
    Employee() {
        empNo = 0;
        empName = "No name";
        empDesig = "No Designation";
    }
    
    Employee(int empNo, String empName, String empDesig) {
        this.empNo = empNo;
        this.empName = empName;
        this.empDesig = empDesig;
    }
    
    void display() {
        System.out.println("Employee number: " + this.empNo);
        System.out.println("Employee name: " + this.empName);
        System.out.println("Employee designation: " + this.empDesig);
    }
    
}