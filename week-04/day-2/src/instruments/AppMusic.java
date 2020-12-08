package instruments;

public class AppMusic {
    public static void main(String[] args) {
        StringedInstrument guitar = new ElectricGuitar(6);
        StringedInstrument bassGuitar = new BassGuitar(4);
        StringedInstrument violin = new Violin(4);

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        ElectricGuitar guitar2 = new ElectricGuitar(7);
        BassGuitar bassGuitar2 = new BassGuitar(5);

        System.out.println("\n");
        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }
}
