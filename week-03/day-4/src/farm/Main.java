//# Farm
//
//        - Reuse your `Animal` class
//- Create a `Farm` class
//  - it has list of Animals
//          - it has slots which defines the number of free places for animals
//          - breed() -> creates a new animal if there's place for it
//          - slaughter() -> removes the least hungry animal

package farm;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Farm.breed();
        }
        Farm.slaughter();
        System.out.println(Farm.list.size());
    }
}
