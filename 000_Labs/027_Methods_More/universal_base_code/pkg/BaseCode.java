package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseCode {
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;

    public BaseCode() {
        role = "Unknown";
        strength = 0;
        dexterity = 0;
        intelligence = 0;
        charisma = 0;
    }

    public void setRole(String r) {
        if (r.equals("Wizard") || r.equals("Warrior") || r.equals("Rogue")) {
            role = r;
        } else {
            role = "Unknown";
        }
    }

    public void setStrength(int s) {
        if (s < 0) {
            strength = 0;
        } else {
            strength = s;
        }
    }

    public void setDexterity(int d) {
        if (d < 0) {
            dexterity = 0;
        } else {
            dexterity = d;
        }
    }

    public void setIntelligence(int i) {
        if (i < 0) {
            intelligence = 0;
        } else {
            intelligence = i;
        }
    }

    public void setCharisma(int c) {
        if (c < 0) {
            charisma = 0;
        } else {
            charisma = c;
        }
    }

    public void printCharacter() {
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
    }
}
