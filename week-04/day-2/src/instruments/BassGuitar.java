package instruments;

public class BassGuitar extends StringedInstrument {


    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

    @Override
    String getType() {
        return "Bass Guitar";
    }
}
