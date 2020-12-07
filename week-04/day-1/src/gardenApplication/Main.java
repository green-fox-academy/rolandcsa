package gardenApplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.plants.add(new Flower("yellow"));
        garden.plants.add(new Flower("blue"));
        garden.plants.add(new Tree("purple"));
        garden.plants.add(new Tree("orange"));

        for (int i = 0; i < garden.plants.size(); i++) {
            garden.plants.get(i).info();
        }

        System.out.println("\n");
        garden.watering(40);

        for (int i = 0; i < garden.plants.size(); i++) {
            garden.plants.get(i).info();
        }
        System.out.println("\n");
        garden.watering(70);
        for (int i = 0; i < garden.plants.size(); i++) {
            garden.plants.get(i).info();
        }
        System.out.println("\n");
        for (int i = 0; i < garden.plants.size(); i++) {
            System.out.println(garden.plants.get(i).waterLevel);
        }
    }
}
