package com.perscholas.java_basics.GLAB_303_5_2;

import java.util.Scanner;

public class GuesstheNumber {
    /*
    -- Guess the Number --
    Write a program that randomly generates an integer between 0 and 100, inclusive.
    The program should prompt the user to enter a number repeatedly until the number matches the randomly generated number.
    For each user input, the program tells the user whether the input is too low or too high.
    When the user discovers the correct answer, the program outputs a congratulatory message, and then provides the user with the opportunity to play again.

     */
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;
        while (guess != number) {
            // Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        } // End of loop
    }

}
