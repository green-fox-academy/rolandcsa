package pirate;

public class Pirate {
    int drunkness;
    String reply1 = "Pour me anudder!";
    String reply2 = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";

    public void drinkSomeRum() {
        drunkness++;
    }

    public void howsItGoingMate() {
        if (drunkness <= 4) {
            System.out.println(reply1);
        } else {
            System.out.println(reply2);
        }
//        Not finished
    }
}

