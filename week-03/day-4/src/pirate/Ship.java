package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crew = new ArrayList<>();
    Pirate captain;

    public void fillShip() {
        captain = new Pirate();
        int random = (int) (1 + Math.random() * 5);
        for (int i = 0; i < random; i++) {
            crew.add(new Pirate());
        }
        crew.add(captain);
    }

    public void listCrew() {
        for (Pirate pirate : crew) {
            System.out.println(pirate.getName());
        }

    }

    public void printInformation() {
        System.out.println("The captain's drunkness is: " + captain.intoxication);
        System.out.println("The captain is passed out: " + captain.isPassedOut);
        System.out.println("The captain is dead: " + captain.isDead);
        int alivePirates = getAlivePirates();
        System.out.println("Number of alive pirates in the crew: " + alivePirates);
    }

    private int getAlivePirates() {
        int alivePirates = 0;

        for (Pirate pirate : crew) {
            if (!pirate.isDead) {
                alivePirates++;
            }
        }
        return alivePirates;
    }

    public boolean battle(Ship otherShip) {
        int score = getAlivePirates() - captain.intoxication;
        int otherShipScore = otherShip.getAlivePirates() - otherShip.captain.intoxication;

        if (score > otherShipScore) {
            otherShip.battleDeath();
            battleWinner();
            return true;
        } else if (score == otherShipScore) {
            return false;
        } else {
            battleDeath();
            otherShip.battleWinner();
            return false;
        }
    }

    public void battleDeath() {
        int deathNumber = (int) (Math.random() * getAlivePirates());
        int killed = 0;
        int i = 0;

        while (killed < deathNumber) {
            if (!crew.get(i).isDead) {
                crew.get(i).die();
                killed++;
            }
            i++;
        }
    }

    public void battleWinner() {
        int random = (int) (Math.random() * 10);
        for (Pirate pirate : crew) {
            for (int i = 0; i < random; i++) {
                pirate.intoxication++;
            }
        }
    }
}


