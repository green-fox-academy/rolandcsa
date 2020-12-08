package instruments;

public class Violin extends StringedInstrument {


    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public String sound() {
        return "Screech";
    }

    @Override
    String getType() {
        return "Violin";
    }
}
