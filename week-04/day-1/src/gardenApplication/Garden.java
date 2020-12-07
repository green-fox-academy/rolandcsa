package gardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();

    public void watering(int waterAmount) {
        System.out.println("Watering with " + waterAmount);

        int howManyNeedsWater = getHowManyNeedsWater();
        for (int i = 0; i < plants.size(); i++)
            if (plants.get(i).needsWater()) {
                plants.get(i).setWaterLevel((int) (waterAmount / howManyNeedsWater * plants.get(i).getAbsorptionRate()));
            }
    }

    private int getHowManyNeedsWater() {
        int howManyNeedsWater = 0;

        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                howManyNeedsWater++;
            }
        }
        return howManyNeedsWater;
    }
}


