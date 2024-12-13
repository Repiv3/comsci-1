import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dog name? ");
        String name1 = scanner.nextLine();
        System.out.print("What age should " + name1 + " be? ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        Dog firstDog = new Dog(name1, age1);
        Dog secondDog = new Dog("Charlie", "Beagle");

        System.out.println(firstDog.description());
        System.out.println(secondDog.description());

        if (!firstDog.isSleeping()) {
            System.out.println(name1 + " is awake!");
            firstDog.bark();

            if (!secondDog.isSleeping()) {
                System.out.println(secondDog.getName() + " hears " + name1 + "!");
                secondDog.bark();
            }
        } else {
            System.out.println(name1 + " is asleep!");
        }
    }
}
