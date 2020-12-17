package poker;

import java.util.Collections;
import java.util.HashMap;

public class HandStrength {











//
//
//                int counter=0;
//                for(int i=0;i<hand.getHand().size();i++){
//        for(int j=0;j<i -j;j++){
//        if(hand.getHand().get(i).getName()==hand.getHand().get(j).getName()){
//        counter++;
//        }
//        }
//        }
//        return counter==4;
//        }

    public static boolean isThreeOfAKind(Hand hand) {
        int counter = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            for (int j = 0; j < i - j; j++) {
                if (hand.getHand().get(i).getName() == hand.getHand().get(j).getName()) {
                    counter++;
                }
            }
        }
        return counter == 3;
    }

    public static boolean isPair(Hand hand) {
        int counter = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            for (int j = 0; j < i - j; j++) {
                if (hand.getHand().get(i).getName() == hand.getHand().get(j).getName()) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter == 2;
    }
}
