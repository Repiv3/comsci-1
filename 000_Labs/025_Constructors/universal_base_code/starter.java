import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        BaseClass emptyCharacter = new BaseClass();
        System.out.println("Empty character role: " + emptyCharacter.getRole());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a role (Wizard, Warrior, Rogue): ");
        String userInput = sc.nextLine();

        BaseClass userCharacter = new BaseClass(userInput);
        System.out.println("User character role: " + userCharacter.getRole());
    }
}
