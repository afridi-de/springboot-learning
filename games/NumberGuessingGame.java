import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    // This program asks the user to guess a random number between 1 and 100.
    public static void main(String[] args) {
        // Create the tools needed for random number generation and input reading.
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Pick a secret number that the player must guess.
        int randomNumber = rand.nextInt(100) + 1; // Random number between 1 and 100

        int attempts = 0; // Initialize the number of attempts

        // Keep asking until the player guesses correctly.
        while (true) {
            System.out.println("Enter your guess (between 1 and 100):");

            // Read the player's guess from the keyboard.
            int userGuess = scanner.nextInt();
            attempts++; // Increment the number of attempts

            // Compare the guess to the secret number and give feedback.
            if (userGuess == randomNumber) {
                
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                System.out.println("It took you " + attempts + " attempts.");
                scanner.close(); // Close the scanner to prevent resource leaks
                break; // Exit the loop once the correct guess is found.

            } else if (userGuess > randomNumber) {
                System.out.println("Nope! Your guess is higher.");
            } else {
                System.out.println("Nope! Your guess is lower.");
            }
        }
    }
}
