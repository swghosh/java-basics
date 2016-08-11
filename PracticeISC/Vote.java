import java.util.Scanner;
class Vote {
    int age;
    String name;
    void read() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age -> ");
        age = sc.nextInt();
        if(age < 0) throw new NegativeNumberException();
        System.out.print("Name -> ");
        name = sc.nextLine();
    }
    boolean isEligible() {
        boolean flag = true;
        try {
            read();
        }
        catch(NegativeNumberException e) {
            System.out.println("You've entered an invalid age.");
        }
        if(age >= 18) flag = true;
        else flag = false;
        return flag;
    }
    void print() {
        boolean eligible = isEligible();
        System.out.println(name);
        System.out.println(age);
        System.out.println((eligible? "Eligible to vote." : "Not eligible to vote."));
    }
    
}