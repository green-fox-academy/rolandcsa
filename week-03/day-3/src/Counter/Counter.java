package Counter;

public class Counter {
    public int value = 0;
    int initValue = 0;

    public Counter() {
    }

    public Counter(int value) {
        this.value = value;
        this.initValue = value;
    }

    public void add(int number) {
        value = value + number;
    }

    public void add() {
        value++;
    }

    public int get() {
        return value;
    }

    public void reset() {
        this.value = this.initValue;

    }
}

