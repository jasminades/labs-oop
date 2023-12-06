package org.example.week2;
import java.util.Random;
import java.util.Scanner;
public class exercise8 {
    public exercise8() {
    }

    public static void main(String[] args) {
        int number = drawNumber();
        System.out.println("Secret number is " + number);
        Scanner reader = new Scanner(System.in);

        int guessNumbers = 0;
        while (true) {
            System.err.println("Guess a number");
            int guess = Integer.parseInt(reader.nextLine());

            guessNumbers++;

            if (guess > number) {
                System.err.println("The number is lesser, guess made " + guessNumbers);
            } else if (guess < number) {
                System.err.println("The number is greater, guess made " + guessNumbers);
            } else {
                System.err.println("Congrats");
                break;
            }

        }
    }

    private static int drawNumber() {
        Random rand = new Random();
        int value = rand.nextInt(101);
        return value;
    }
}
