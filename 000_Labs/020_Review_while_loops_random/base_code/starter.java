import java.util.Random;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int guess;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        }
    }
}
