abstract class StringedInstrument extends Instrument {
    int numberOfStrings;
    StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }
}