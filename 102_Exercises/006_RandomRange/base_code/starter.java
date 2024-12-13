import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter the starting integer: ");
        int start = input.nextInt();
        
        int end;
        do {
            System.out.print("Enter the ending integer (must be larger than the starting integer): ");
            end = input.nextInt();
        } while (end <= start);
        
        int randomNumber = rand.nextInt(end - start + 1) + start;
        
        System.out.println("Random number generated in the range: " + randomNumber);
        
        input.close();
    }
}
