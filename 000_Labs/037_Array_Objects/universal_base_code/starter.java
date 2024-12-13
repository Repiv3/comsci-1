import pkg.*;
import java.util.*;

public class starter {
    public static void main(String[] args) {
        Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior" + i);
            wizards[i] = new Wizard("Wizard" + i);
        }

        int warriorIndex = 0;
        int wizardIndex = 0;

        while (warriorIndex < 100 && wizardIndex < 100) {
            wizards[wizardIndex].attack(warriors[warriorIndex]);
            if (warriors[warriorIndex].isDead()) {
                warriorIndex++;
            }

            if (warriorIndex < 100) {
                warriors[warriorIndex].attack(wizards[wizardIndex]);
                if (wizards[wizardIndex].isDead()) {
                    wizardIndex++;
                }
            }
        }

        if (warriorIndex == 100) {
            System.out.println("Wizards win!");
        } else {
            System.out.println("Warriors win!");
        }
    }
}
