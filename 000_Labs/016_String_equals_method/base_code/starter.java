import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose your role (Wizard, Warrior, Rogue): ");
        String role = scanner.nextLine().trim().toLowerCase();

        if (role.equals("wizard")) {
            System.out.println("You have chosen the Wizard role.");
        } else if (role.equals("warrior")) {
            System.out.println("You have chosen the Warrior role.");
        } else if (role.equals("rogue")) {
            System.out.println("You have chosen the Rogue role.");
        } else {
            System.out.println("Invalid input! Please choose either Wizard, Warrior, or Rogue.");
        }
    }
}
