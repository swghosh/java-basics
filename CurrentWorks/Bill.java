class Bill extends Detail {
    
    int n;
    double amt;
    
    Bill(String name, String address, long telno,int rent, int no) {
        super(name, address, telno, rent);
        n = no;
        amt = 0.0;
    }
    
    void cal() {
        if(n >= 1 && n <= 100) {
            amt = rent;
        }
        else if(n >= 101 && n <= 200) {
            amt = rent + (0.60 * n);
        }
        else if(n >= 201 && n <= 300) {
            amt = rent + (0.80 * n);
        }
        else {
            amt = rent + (1 * n);
        }
    }
    
    void show() {
        super.show();
        System.out.println("No. of Calls : " + n);
        System.out.println("Bill Amount : " + amt);
    }
}