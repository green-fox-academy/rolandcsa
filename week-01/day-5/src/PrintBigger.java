// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Please input two numbers to see which one is bigger!");
        Scanner numbers = new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("Those numbers are equal!");
        }

    }
}
