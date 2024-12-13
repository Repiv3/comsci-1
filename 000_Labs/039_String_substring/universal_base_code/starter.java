import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            System.out.println((i + 1) + ": " + word.charAt(i));
        }
        
    }
}
