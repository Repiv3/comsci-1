import java.util.Random;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int money = 100;

        System.out.println("Welcome to the Slot Machine Game");
        System.out.println("You start with $100.");

        while (money > 0) {
            System.out.println("You have $" + money + ".");
            System.out.print("Enter your wager (or 0 to quit): ");
            int wager = scanner.nextInt();

            if (wager == 0 || wager > money) {
                System.out.println("You lost and leave with $" + money + ".");
                break;
            }

            System.out.println("Spinning");
            int slot1 = random.nextInt(10);
            int slot2 = random.nextInt(10);
            int slot3 = random.nextInt(10);

            System.out.println("shows: " + slot1 + " " + slot2 + " " + slot3);

            if (slot1 == slot2 && slot2 == slot3) {
                System.out.println("JACKPOT! triple");
                money += wager * 2;
            } else if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3) {
                System.out.println("Two numbers match double");
                money += wager;
            } else {
                System.out.println("No matches You lose");
                money -= wager;
            }

            if (money <= 0) {
                System.out.println("You're out of money! Game over.");
                break;
            }

            System.out.print("Do you want to play again? (Yes/No): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("No") || response.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing! You leave with $" + money + ".");
                break;
            }
        }

        scanner.close();
    }
}
