import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner whatsYourName = new Scanner(System.in);
        String username = whatsYourName.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}
