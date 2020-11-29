//# Personal finance
//
//        We are going to represent our expenses in a list containing integers.
//
//        - Create a list with the following items.
//        - 500, 1000, 1250, 175, 800 and 120
//        - Create an application which solves the following problems.
//        - How much did we spend?
//        - Which was our greatest expense?
//        - Which was our cheapest spending?
//        - What was the average amount of our spendings?

import java.util.ArrayList;


public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);
        int sum = 0;

        for (int i = 0; i < expenses.size(); i++) {
            sum = sum + expenses.get(i);
        }
        System.out.println("We spent this amount: " + sum);

        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(0) < expenses.get(i)) {
                expenses.set(0, expenses.get(i));
            }
        }
        System.out.println("The greatest expense was: " + expenses.get(0));

        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(0) > expenses.get(i)) {
                expenses.set(0, expenses.get(i));
            }
        }
        System.out.println("The cheapest spending was: " + expenses.get(0));
        
        int avarage = sum / expenses.size();
        System.out.println("The avarage amount of spending was: " + avarage);
    }
}
