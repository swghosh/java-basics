class Detail {
    
    String name, address;
    long telno;
    int rent;
    
    Detail(String n, String a, long t,int r) {
        name = n;
        address = a;
        telno = t;
        rent = r;
    }
    
    void show() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Telephone Number : " + telno);
        System.out.println("Rent : " + rent);
    }
    
}