import java.util.Random;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctNumber = rand.nextInt(1000) + 1;

        System.out.print("Guess a number between 1 and 1000: ");
        int userGuess = scanner.nextInt();

        if (userGuess == correctNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else if (userGuess > correctNumber) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("Your guess is too low.");
        }
    }
}
