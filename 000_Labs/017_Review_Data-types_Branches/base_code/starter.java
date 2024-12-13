import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Title: ");
        String title = input.nextLine();

        System.out.print("Role (Wizard, Warrior, Rogue): ");
        String role = input.nextLine();

        int points = 30;
        int strength = 0;
        int dexterity = 0;
        int intelligence = 0;
        int charisma = 0;

        while (points > 0) {
            System.out.println("Points left: " + points);

            System.out.print("Strength: ");
            int s = input.nextInt();
            if (s > points || s > 10) {
                System.out.println("No.");
                continue;
            }
            strength = s;
            points -= s;

            System.out.println("Points left: " + points);

            System.out.print("Dexterity: ");
            int d = input.nextInt();
            if (d > points || d > 10) {
                System.out.println("No.");
                continue;
            }
            dexterity = d;
            points -= d;

            System.out.println("Points left: " + points);

            System.out.print("Intelligence: ");
            int i = input.nextInt();
            if (i > points || i > 10) {
                System.out.println("No.");
                continue;
            }
            intelligence = i;
            points -= i;

            System.out.println("Points left: " + points);

            System.out.print("Charisma: ");
            int c = input.nextInt();
            if (c > points || c > 10) {
                System.out.println("No.");
                continue;
            }
            charisma = c;
            points -= c;
        }

        System.out.println("Done!");
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);

        input.close();
    }
}
