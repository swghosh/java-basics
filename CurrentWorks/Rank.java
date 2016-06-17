
class Rank extends Record {
    
    int index;
    
    Rank() {
        super();
        index = 0;
    }
    
    void highest() {
        int r = mk[0];
        for(int i = 0; i < name.length; i++) {
            if(mk[i] < r) {
                r = mk[i];
                index = i;
            }
        }
    }
    
    void display() {
        super.display();
        System.out.println("Highest Rank - " + name[index] + " : " + mk[index]);
    }
    
}