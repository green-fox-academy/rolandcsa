package instruments;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    String getType() {
        return "Electric Guitar";
    }
}
