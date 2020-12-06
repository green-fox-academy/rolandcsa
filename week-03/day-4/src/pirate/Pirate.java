package pirate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pirate {
    int intoxication = 0;
    String reply1 = "Pour me anudder!";
    String reply2 = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    String status = "He's dead.";
    boolean isDead = false;
    boolean isPassedOut = false;
    private String name;

    public Pirate() {
        setName();
    }


    public void drinkSomeRum() {
        intoxication++;

        if (isDead = true) {
            System.out.println(status);
        }
    }

    public void howsItGoingMate() {
        if (isDead) {
            System.out.println(status);
        } else if (intoxication <= 4) {
            System.out.println(reply1);
        } else {
            System.out.println(reply2);
        }

    }

    public void die() {
        isDead = true;
    }

    public void passOut() {
        isPassedOut = true;
    }

    public void brawl(Pirate otherPirate) {
        int roll = (int) (1 + Math.random() * 3);
        if (isDead) {
            System.out.println(name + " is dead.");
        } else if (otherPirate.isDead) {
            System.out.println(otherPirate.name + " is dead.");
        } else {
            switch (roll) {
                case 1 -> die();
                case 2 -> otherPirate.die();
                case 3 -> {
                    passOut();
                    otherPirate.passOut();
                }
            }
        }
    }

    private void setName() {
        Path namePath = Paths.get("src/pirate/names.txt");
        List<String> names = new ArrayList<>();
        try {
            names = Files.readAllLines(namePath);
        } catch (IOException e) {
            System.err.println("Could not read file.");
        }
        int randomIndex = (int) (Math.random() * names.size());
        name = names.get(randomIndex);
    }

    public String getName() {
        return name;
    }
}


