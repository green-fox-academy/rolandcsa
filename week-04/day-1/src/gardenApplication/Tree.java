package gardenApplication;

public class Tree extends Plant {
    public Tree(String color) {
        super(color);
    }

    @Override
    public boolean needsWater() {
        return waterLevel < 10;
    }

    @Override
    public String getType() {
        return "Tree";
    }

    @Override
    public double getAbsorptionRate() {
        return 0.4;
    }
}


