class ElectricGuitar extends StringedInstrument {
    ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }
    void play() {
        System.out.println("A " + this.numberOfStrings + "-stringed "+ this.name + " is rocking!");
    }
}