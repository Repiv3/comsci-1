public class starter {
    public static void main(String[] args) {
        Character myCharacter = new Character("Wizard", 10, 8, 7, 5);
        myCharacter.printStats();
    }
}

class Character {
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;

    public Character(String role, int strength, int dexterity, int intelligence, int charisma) {
        this.role = role;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public void printStats() {
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
    }
}
