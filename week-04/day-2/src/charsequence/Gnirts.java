package charsequence;

public class Gnirts implements CharSequence {
    String name;

    public Gnirts(String name) {
        this.name = name;
    }

    @Override
    public int length() {
        return this.name.length();
    }

    @Override
    public char charAt(int index) {
        return this.name.charAt(length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
