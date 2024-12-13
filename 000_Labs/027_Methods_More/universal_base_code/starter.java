import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseCode myCharacter = new BaseCode();

        System.out.print("Enter role (Wizard, Warrior, Rogue): ");
        String role = scanner.nextLine();
        myCharacter.setRole(role);

        System.out.print("Enter strength: ");
        int strength = scanner.nextInt();
        myCharacter.setStrength(strength);

        System.out.print("Enter dexterity: ");
        int dexterity = scanner.nextInt();
        myCharacter.setDexterity(dexterity);

        System.out.print("Enter intelligence: ");
        int intelligence = scanner.nextInt();
        myCharacter.setIntelligence(intelligence);

        System.out.print("Enter charisma: ");
        int charisma = scanner.nextInt();
        myCharacter.setCharisma(charisma);

        myCharacter.printCharacter();
    }
}
