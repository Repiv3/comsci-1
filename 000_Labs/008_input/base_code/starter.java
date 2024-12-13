import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your birthday month: ");
        String birthdayMonth = scanner.nextLine();

        System.out.print("Enter your birthday day: ");
        int birthdayDay = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your birthday year: ");
        int birthdayYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("How much is a buck fifty? ");
        String buckFifty = scanner.nextLine();

        System.out.println("Your first name is " + firstName + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your birthday is on " + birthdayMonth + " " + birthdayDay + ", " + birthdayYear + ".");
        System.out.println("A buck fifty is " + buckFifty + ".");
    }
}
