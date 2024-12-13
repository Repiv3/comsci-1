package pkg;

public class BaseClass {
    private String role;

    public BaseClass() {
        role = "No Role";
    }

    public BaseClass(String role) {
        if (role.equalsIgnoreCase("Wizard")) {
            this.role = "Wizard";
            System.out.println("You chose Wizard! A wise choice!");
        } else if (role.equalsIgnoreCase("Warrior")) {
            this.role = "Warrior";
            System.out.println("You chose Warrior! Brave!");
        } else if (role.equalsIgnoreCase("Rogue")) {
            this.role = "Rogue";
            System.out.println("You chose Rogue! How courageous!");
        } else {
            this.role = "No Role";
            System.out.println("Invalid role. Role set to 'No Role'.");
        }
    }

    public String getRole() {
        return role;
    }
}
