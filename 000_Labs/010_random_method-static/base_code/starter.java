import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomInt1 = rand.nextInt(10);
        System.out.println("Random integer between 0 and 9: " + randomInt1);

        int randomInt2 = rand.nextInt(100) + 1;
        System.out.println("Random integer between 1 and 100: " + randomInt2);

        double randomDouble1 = 2.5 + (3.5 - 2.5) * rand.nextDouble();
        System.out.println("Random double between 2.5 and 3.5: " + randomDouble1);

        double randomDouble2 = 14 + (589 - 14) * rand.nextDouble();
        System.out.println("Random double between 14 and 589: " + randomDouble2);
    }
}
