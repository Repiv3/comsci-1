import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week (0 = Sunday, 1 = Monday, 2 = Tuesday, ..., 6 = Saturday): ");
        int dayOfWeek = scanner.nextInt();

        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Wake up at 7:00 AM!");
        } else if (dayOfWeek == 0 || dayOfWeek == 6) {
            System.out.println("Wake up at 10:00 AM!");
        } else {
            System.out.println("Invalid day. Please enter a number between 0 and 6.");
        }

        scanner.close();
    }
}
