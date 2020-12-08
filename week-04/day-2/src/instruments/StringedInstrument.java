package instruments;

public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(getType() + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }

    abstract String sound();

    abstract String getType();
}