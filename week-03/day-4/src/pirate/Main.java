package pirate;

public class Main {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        pirate1.brawl(pirate2);
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship1.printInformation();
        ship2.fillShip();
        ship2.printInformation();
        System.out.println(ship1.battle(ship2));
        ship1.printInformation();
        ship2.printInformation();
    }
}
