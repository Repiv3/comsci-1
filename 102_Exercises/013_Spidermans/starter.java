import pkg.*;
import java.util.*;

public class starter {
    public static void main(String[] args) {
        Spiderman spiderman1 = new Spiderman("Tobey Maguire", 48, "Green Goblin");
        Spiderman spiderman2 = new Spiderman("Andrew Garfield", 40, "Electro");
        Spiderman spiderman3 = new Spiderman("Tom Holland", 27, "The Vulture");
        Spiderman spiderman4 = new Spiderman();

        spiderman4.setActor("Miles Morales");
        spiderman4.setAge(17);
        spiderman4.setVillain("Kingpin");

        spiderman1.fight();
        spiderman2.fight();
        spiderman3.fight();
        spiderman4.fight();

        spiderman4.printArt();
    }
}
