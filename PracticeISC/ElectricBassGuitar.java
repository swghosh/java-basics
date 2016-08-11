class ElectricBassGuitar extends StringedInstrument {
    ElectricBassGuitar(int numberOfStrings) {
        super("Electric Bass Guitar", numberOfStrings);
    }
    void play() {
        System.out.println("A " + this.numberOfStrings + "-stringed "+ this.name + " is rocking!");
    }
} 