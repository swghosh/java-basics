class Worker {

    String name;
    double basic;

    Worker(String name, double basic) {
        this.name = name;
        this.basic = basic;
    }

    void display() {
        System.out.println("Worker name: " + name);
        System.out.println("Basic pay: " + basic);        
    }
    
}